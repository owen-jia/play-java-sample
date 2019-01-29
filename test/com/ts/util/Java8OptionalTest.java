package com.ts.util;

import com.ts.util.optional.ICar;
import com.ts.util.optional.WeiLaiCar;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * @author: Owen Jia
 * @time: 2019/1/29 14:34
 */
public class Java8OptionalTest {

    static Integer sum = new Integer(1);

    List<String> stringList = null;

    ICar car = new WeiLaiCar();

    public static void main(String[] args){
        Java8OptionalTest test = null;
        Java8OptionalTest test2 = new Java8OptionalTest();
        test2.setCar(new WeiLaiCar());

        Optional<Java8OptionalTest> optional = Optional.ofNullable(Optional.ofNullable(test).orElse(test2));
        pringTest(optional.isPresent());

        optional.ifPresent( tt -> pringTest(tt) );
        List list = optional.map( m -> m.getStringList()).orElse(Collections.emptyList());
        pringTest(list);

        Java8OptionalTest result = optional.get();
        pringTest(result);
        pringTest(printWheel(result));

        pringTest(test2.equals(test));

        pringTest(filterTest(test2));
        pringTest(filterTest(test));
    }

    public static void pringTest(Object print){
        System.out.println(sum++ + " : " +print);
    }

    public List<String> sayHello(){
        return Optional.ofNullable(stringList).orElse(Collections.EMPTY_LIST);
    }

    public static Integer printWheel(Java8OptionalTest test){
        return Optional.ofNullable(test).map(m -> m.getCar()).get().getWheelCount();
    }

    public static Boolean filterTest(Java8OptionalTest test){
        return Optional.ofNullable(test).filter(t -> t.getCar() != null && t.getCar().getWheelCount() > 0).isPresent();
    }

    public ICar getCar() {
        return car;
    }

    public void setCar(ICar car) {
        this.car = car;
    }

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }
}
