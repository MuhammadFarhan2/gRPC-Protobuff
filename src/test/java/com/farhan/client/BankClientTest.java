package com.farhan.client;

import com.farhan.models.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.concurrent.CountDownLatch;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BankClientTest {
    BankServiceGrpc.BankServiceBlockingStub blockingStub;
    BankServiceGrpc.BankServiceStub bankServiceStub;

    @BeforeAll
    public void setup(){
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 6565)
                .usePlaintext()
                .build();
       this.blockingStub = BankServiceGrpc.newBlockingStub(managedChannel);
        this.bankServiceStub = BankServiceGrpc.newStub(managedChannel);
    }

    @Test
    public void balanceTest(){
        BankCheckRequest bankCheckRequest = BankCheckRequest.newBuilder().setAccountNumber(7).build();
        Balance balance = this.blockingStub.getBalance(bankCheckRequest);

        System.out.println(
                "recieved balanace: "+balance.getAmount()
        );

    }

    @Test
    public void withdrawRequest(){
        WithdrawRequest withdrawRequest = WithdrawRequest.newBuilder().setAccountNumber(9).setAmount(10).build();
        this.blockingStub.getWithdraw(withdrawRequest)
                .forEachRemaining(money -> System.out.println("Received: "+money.getValue()));
    }

    @Test
    public void asyncClient() throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(1);
        WithdrawRequest withdrawRequest = WithdrawRequest.newBuilder().setAccountNumber(5).setAmount(25).build();
        this.bankServiceStub.getWithdraw(withdrawRequest,new MoneyStreamAync(latch));
//        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);

        latch.await();
    }


    @Test
    public void clientStreamCashDeposit() throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(1);
        StreamObserver<DepositRequest> depositRequestStreamObserver = this.bankServiceStub.cashDeposit(new BalanceStreamObserver(latch));

        for (int i = 0; i < 10; i++) {
            DepositRequest depositRequest = DepositRequest.newBuilder().setAccountNumber(7).setAmount(10).build();
            depositRequestStreamObserver.onNext(depositRequest);
        }
        depositRequestStreamObserver.onCompleted();

        latch.await();


    }

}
