package com.kgliu.design.pattern.creational.simplefactory;

/**
 * @author: kgliu
 * @date: 2023-05-20 0:34
 */
public class Test1 {
    public static void main(String[] args) {
        Video video = new JavaVideo();
        video.produce();
    }
}
