package com.geely.design.pattern.behavioral.observer.flow;

import java.util.concurrent.Flow;

public class Teacher implements Flow.Subscriber<Question> {
    private String teacherName;
    private Flow.Subscription subscription;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        this.subscription = subscription;
        subscription.request(2); // Request one item at a time
    }

    @Override
    public void onNext(Question question) {
        System.out.println(teacherName + "老师接收到一个问题：" + question.toString());
        subscription.request(2); // Request the next item
    }

    @Override
    public void onError(Throwable throwable) {
        throwable.printStackTrace();
    }

    @Override
    public void onComplete() {
        System.out.println(teacherName + "老师完成了问题的接收");
    }
}
