package com.kgliu.design.pattern.creational.simplefactory;

/**
 * @author: kgliu
 * @date: 2023-05-20 1:24
 */
public class ReflectTest {
    public static void main(String[] args) {
        ReflectVideoFactory reflectVideoFactory=new ReflectVideoFactory();
        Video video = reflectVideoFactory.getVideo(JavaVideo.class);
        if (video != null) {
            return;
        }
        video.produce();
    }


}
