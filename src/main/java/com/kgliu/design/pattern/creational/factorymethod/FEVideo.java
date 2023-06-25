package com.kgliu.design.pattern.creational.factorymethod;

/**
 * @author: kgliu
 * @date: 2023-05-20 20:57
 */
public class FEVideo extends Video {
    @Override
    public void produce() {
        System.out.println("FEVideo");
    }
}
