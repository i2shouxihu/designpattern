package com.geely.design.pattern.behavioral.observer;

/**
 * @author: kgliu
 * @date: 2023-05-29 22:57
 */
public class Test {
    public static void main(String[] args) {
        Course course=new Course("java设计模式精讲");
        Teacher teacher1 = new Teacher("Alpha");
        Teacher teacher2 = new Teacher("Beta");
        course.addObserver(teacher1);
        course.addObserver(teacher2);

        // 业务逻辑代码
        Question question = new Question();
        question.setUserName("geely");
        question.setQuestionContent("java的主函数如何编写");
        course.productQuestion(course,question);
    }
}
