package com.ts.util.java8.functions;

import com.ts.util.PrintUtil;

/**
 * 自定义函数式接口
 * @author: Owen Jia
 * @time: 2019/2/13 10:53
 */
@FunctionalInterface
public interface IPerson {

    String say(String input);

    //void stand(); 只能有一个抽象方法，不然编译无法默认识别调用

    static void run(String xx){
        PrintUtil.printTest("IPerson run : " + xx);
    }

    static void walk(){
        PrintUtil.printTest("IPerson walk");
    }

    default void eat(int a, int b){
        PrintUtil.printTest("IPerson eat : " + a + " - " + b);
    }
}
