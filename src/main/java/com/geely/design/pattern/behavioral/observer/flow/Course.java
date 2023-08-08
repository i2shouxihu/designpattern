package com.geely.design.pattern.behavioral.observer.flow;

import java.util.concurrent.Flow;

public class Course implements Flow.Publisher<Question> {
    private String courseName;
    private Flow.Subscriber<? super Question> subscriber;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void productQuestion(Question question) {
        System.out.println(question.getUserName() + "在" + courseName + "提交了一个问题");
        if (subscriber != null) {
            subscriber.onNext(question);
        }
    }

    @Override
    public void subscribe(Flow.Subscriber<? super Question> subscriber) {
        this.subscriber = subscriber;
        subscriber.onSubscribe(new CourseSubscription());
    }

    private class CourseSubscription implements Flow.Subscription {
        private boolean cancelled = false;

        @Override
        public void request(long n) {
            // No-op, we send questions immediately without backpressure
            for (long i = 0; i < n; i++) {
                System.out.println("ggg");
            }
        }

        @Override
        public void cancel() {
            cancelled = true;
        }
    }
}
