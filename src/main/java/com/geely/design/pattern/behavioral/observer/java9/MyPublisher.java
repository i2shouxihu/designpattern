package com.geely.design.pattern.behavioral.observer.java9;

import java.util.concurrent.Flow;
import java.util.concurrent.atomic.AtomicBoolean;

public class MyPublisher implements Flow.Publisher<Integer> {
    @Override
    public void subscribe(Flow.Subscriber<? super Integer> subscriber) {
        MySubscription mySubscription = new MySubscription(subscriber);
        subscriber.onSubscribe(mySubscription);
    }

    private class MySubscription implements Flow.Subscription {
        private final Flow.Subscriber<? super Integer> subscriber;
        private final AtomicBoolean isCanceled = new AtomicBoolean(false);

        MySubscription(Flow.Subscriber<? super Integer> subscriber) {
            this.subscriber = subscriber;
        }

        @Override
        public void request(long n) {
            for (int i = 1; i <= n && !isCanceled.get(); i++) {
                subscriber.onNext(i);
            }
            if (isCanceled.get()) {
                subscriber.onComplete();
            }
        }

        @Override
        public void cancel() {
            isCanceled.set(true);
        }
    }
}