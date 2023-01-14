package org.example.server;

import com.farhan.models.Balance;
import com.farhan.models.DepositRequest;
import io.grpc.stub.StreamObserver;

import java.util.stream.Stream;

public class CashDepositStreaming implements StreamObserver<DepositRequest> {
    private int accountBalance;
    private StreamObserver<Balance> balanceStreamObserver;

    public CashDepositStreaming(StreamObserver<Balance> responseObserver) {
        this.balanceStreamObserver = responseObserver;
    }

    @Override
    public void onNext(DepositRequest depositRequest) {
        int accountNumber = depositRequest.getAccountNumber();
        int amount = depositRequest.getAmount();
         this.accountBalance = AccountDatabase.addBalance(accountNumber, amount);
    }

    @Override
    public void onError(Throwable throwable) {

    }

    @Override
    public void onCompleted() {
        Balance balance = Balance.newBuilder().setAmount(this.accountBalance).build();
        balanceStreamObserver.onNext(balance);
        balanceStreamObserver.onCompleted();

    }
}
