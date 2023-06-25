package com.kgliu.design.pattern.creational.factorymethod;

/**
 * @author: kgliu
 * @date: 2023-05-20 20:37
 */
public class PythonVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
