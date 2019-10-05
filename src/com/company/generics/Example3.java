package com.company.generics;

import javafx.util.Pair;

import java.util.Date;

public class Example3 {
    //example3
    //example below shows that
    //i. how to create generic method
    // a. using generic methods (even defined by yourself) you can send to any type
    // b. using generic class constructor you can swap types of parameters
    public static void main(String[] args) {


        Pair<Integer,String> pair1 = new Pair<>(1,"text");
        Pair<String,Integer> pair2 = new Pair<>("text",1);

        print(pair1.getKey(),pair1.getValue());
        print(pair2.getKey(),pair2.getValue());
        print("key","value");
        print(new Date(),1111);

    }

    public static <K,V> void print (K key,V value)
    {
        System.out.printf("key is: " + key + "\n");
        System.out.printf("value is: " + value + "\n");
    }
}
