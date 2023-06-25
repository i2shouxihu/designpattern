package com.kgliu.design.pattern.creational.simplefactory;

/**
 * @author: kgliu
 * @date: 2023-05-20 0:52
 */
public class Test2 {
    public static void main(String[] args) {
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo("java");
        if (video == null) {
            return;
        }
        video.produce();

    }


}
