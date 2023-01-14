package com.farhan.client;

import com.farhan.models.Money;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.CountDownLatch;

public class MoneyStreamAync implements StreamObserver<Money> {
    private final CountDownLatch latch;

    public MoneyStreamAync(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void onNext(Money money) {
        System.out.println("Amount is: "+money.getValue());
    }

    @Override
    public void onError(Throwable throwable) {
        System.out.println(throwable.getMessage());
        latch.countDown();
    }

    @Override
    public void onCompleted() {
        System.out.println("I am done!");
latch.countDown();
    }
}
