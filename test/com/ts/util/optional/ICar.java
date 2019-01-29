package com.ts.util.optional;

/**
 * @author: Owen Jia
 * @time: 2019/1/29 15:06
 */
public interface ICar {

    /**
     * 轮子数量
     * @return
     */
    int getWheelCount();

    void setCarWheel(int count);

    default void print(){
        System.out.println(this.getClass().getName());
    }
}
