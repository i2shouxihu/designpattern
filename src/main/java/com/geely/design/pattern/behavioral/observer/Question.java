package com.geely.design.pattern.behavioral.observer;

/**
 * @author: kgliu
 * @date: 2023-05-29 22:31
 */
public class Question {

    private String userName;
    private String questionContent;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }
}
