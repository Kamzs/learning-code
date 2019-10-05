package com.company.generics;

import java.util.Date;

public class Run {

    public static void main(String[] args) {

        //before java5 //runtime error
        Comparable test = new Date();
        test.compareTo("teststring");

        //since java 5 - compile error
        Comparable<Date> test2 = new Date();
        test2.compareTo("String");
        //underlined error related to type

    }
}
