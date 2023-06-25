package com.geely.design.pattern.structural.decorator.v2;

public class OuterClass {
    private int outerVariable = 10;
    
    public void outerMethod() {
        // 创建匿名内部类
        Runnable myRunnable = new Runnable() {
            @Override
            public void run() { outerVariable=20;
                System.out.println("Outer Variable: " + outerVariable);

            }
        };
        
        // 调用内部类的方法
        myRunnable.run();
    }
    
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.outerMethod();
    }
}
