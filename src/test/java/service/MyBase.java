package service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Mohammad on 7/3/2017.
 */
public class MyBase {

    public static void main(String[] args) {

        List<Integer> l = Arrays.asList(2, 5, 7, 10, 8);

        l.forEach(System.out::print);

        List l2 = l
                .stream()
                .filter(x -> !x.equals(7) && !x.equals(5))
                .collect(Collectors.toList());

        System.out.println();
        l2.forEach(System.out::print);



//        MyBase m1 = new MyBase();
//        MyBase m2 = new MyDerived();
//
//        m1.say();
//        m2.say();

    }

    void say(){
        System.out.println("MyBase.say");
    }
}
