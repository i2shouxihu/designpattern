package com.kgliu.design.pattern.creational.factorymethod;


/**
 * @author: kgliu
 * @date: 2023-05-20 20:34
 */
public class JavaVideoFactory extends VideoFactory{
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
