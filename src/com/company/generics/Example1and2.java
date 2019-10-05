package com.company.generics;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Example1and2 {

    public static void main(String[] args) {
//example1
        //before java5 //runtime error
        //generally is was not required to tell what is the type of the object created and thus compiler could not tell if for this object method from interface implemented can be used
        //thus below can be complied and after running program in produces error
        Comparable test = new Date();
        test.compareTo("teststring");

        //since java 5 - compile error
        Comparable<Date> test2 = new Date();
        test2.compareTo("String");
        //underlined error related to type

//example2

        //below i can add to list which is a type of interface ArrayList objects (e.g. strings and integers)
        //what i can not do is cast string to integer (thus i get error when i run program)
        ArrayList list = new ArrayList();
        list.add(11);
        list.add("text");
        String a = (String) list.get(0); //ok - old method of using interface
        String b = (String) list.get(1); //produces error which can be fixed by using generic type of interface (as below)

        //from java 7 - once the variable is initialized I do not have to point the type while creating object
        //ArrayList<Integer> listTest = new ArrayList<Integer>();//ok but - do not have to
        ArrayList<Integer> listTest = new ArrayList<>();
        listTest.add(11);
        listTest.add("string"); //compiler see an error
        //above the object is type of class ArrayList<T> but also can be created as object of type of interface implemeneting this class e.g. List

        List<Integer> list1 = new ArrayList<>();
        list1.add("ssss"); //also working fine
    }

}
