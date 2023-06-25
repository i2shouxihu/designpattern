package com.kgliu.design.pattern.creational.simplefactory;

/**
 * @author: kgliu
 * @date: 2023-05-20 1:13
 */
public class ReflectVideoFactory {
    public Video getVideo(Class c) {
        /*
         在给定的代码中，将Video对象video初始化为null是为了处理异常情况。
         如果在通过反射创建对象的过程中抛出了异常，可能无法成功实例化Video对象。
         为了确保在出现异常时能够返回一个合理的值，将video初始化为null是一种常见的做法。
        */
        Video video = null;
        try {
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return video;
    }

}