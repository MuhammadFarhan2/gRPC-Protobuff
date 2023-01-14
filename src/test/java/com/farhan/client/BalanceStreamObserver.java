package com.farhan.client;

import com.farhan.models.Balance;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.CountDownLatch;

public class BalanceStreamObserver implements StreamObserver<Balance> {

    private final CountDownLatch latch;

    public BalanceStreamObserver(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void onNext(Balance balance) {
        System.out.println("Toatl Balance: "+balance.getAmount());
    }

    @Override
    public void onError(Throwable throwable) {
    this.latch.countDown();
    }

    @Override
    public void onCompleted() {
        System.out.println("Done with Server!");
        this.latch.countDown();
    }
}
