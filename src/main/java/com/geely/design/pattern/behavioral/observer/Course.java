package com.geely.design.pattern.behavioral.observer;

import java.util.Observable;

/**
 * @author: kgliu
 * @date: 2023-05-29 22:30
 */
public class Course extends Observable {
    private String courseName;

    public Course(String courseName){
        this.courseName=courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void productQuestion(Course course,Question question){
        System.out.println(question.getUserName()+"在"+course.courseName+"提交了一个问题");
        setChanged();
        notifyObservers(question);
    }
}
