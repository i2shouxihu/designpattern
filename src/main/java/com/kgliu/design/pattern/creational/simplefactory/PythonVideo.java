package com.kgliu.design.pattern.creational.simplefactory;

/**
 * @author: kgliu
 * @date: 2023-05-20 0:33
 */
public class PythonVideo extends Video{

    @Override
    public void produce() {
        System.out.println("PythonVideo");
    }
}
