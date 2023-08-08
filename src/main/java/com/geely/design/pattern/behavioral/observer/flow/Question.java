package com.geely.design.pattern.behavioral.observer.flow;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Question {
    private String userName;
    private String questionContent;

    @Override
    public String toString() {
        return "Question{" +
                "userName='" + userName + '\'' +
                ", questionContent='" + questionContent + '\'' +
                '}';
    }
}
