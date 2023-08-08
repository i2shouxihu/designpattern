package com.geely.design.pattern.behavioral.observer.java9;

public class Test1 {
    public static void main(String[] args) {
        MyPublisher publisher = new MyPublisher();
        MySubscriber subscriber = new MySubscriber();
        publisher.subscribe(subscriber);
    }
}