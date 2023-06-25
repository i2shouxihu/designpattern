package com.kgliu.design.pattern.creational.factorymethod;

/**
 * @author: kgliu
 * @date: 2023-05-20 20:36
 */
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("PythonVideo");
    }
}
