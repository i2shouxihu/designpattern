package com.geely.design.pattern.behavioral.observer.java9;

import java.util.concurrent.Flow;

public class MySubscriber implements Flow.Subscriber<Integer> {
    private Flow.Subscription subscription;

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        this.subscription = subscription;
        this.subscription.request(1);  // request initial 5 items
    }

    @Override
    public void onNext(Integer item) {
        System.out.println("Received: " + item);
        if (item == 5) {
            this.subscription.cancel();  // cancel after receiving 5 items
        }
    }

    @Override
    public void onError(Throwable throwable) {
        throwable.printStackTrace();
    }

    @Override
    public void onComplete() {
        System.out.println("Done");
    }
}