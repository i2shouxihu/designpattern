package com.kgliu.design.pattern.creational.factorymethod;

/**
 * @author: kgliu
 * @date: 2023-05-20 20:57
 */
public class FEVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new FEVideo();
    }
}
