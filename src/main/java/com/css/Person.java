package com.css;

public class Person {
    int name;
    public void callName(int i){
        name=i;
    }
    public static void  main(String [] args){
        Person ss = new Person();
        int i = 199999;
        ss.callName(i);
        System.out.println(System.identityHashCode(i));
        System.out.println(System.identityHashCode(ss.name));
    }
}
