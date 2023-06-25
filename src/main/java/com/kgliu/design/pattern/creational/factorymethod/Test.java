package com.kgliu.design.pattern.creational.factorymethod;

/**
 * @author: kgliu
 * @date: 2023-05-20 20:38
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new JavaVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();
    }
}
