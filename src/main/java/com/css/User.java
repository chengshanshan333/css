package com.css;

public class User {
    private static String school = "Besttest";
    private String name;
    private int age;
    public String sex;
    //定义默认构造函数，初始化使用
    public User(){
        name = "css";
        age = 22;
        sex = "gril";
    }
    //定义带参数的构造方法
    public User(String name,String sex,int age){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    //定义两个参数的构造方法
    public User(String name,String sex){
        this.name = name;
        this.sex = sex;
        this.age = 15;
    }


    //get方法获取类的属性age
    public int getAge() {
        return age;
    }
    //get方法获取类的属性name
    public String getName() {
        return name;
    }
    //get方法获取类的属性sex
    public String getSex() {
        return sex;
    }

    //get方法获取类的静态域
    public static String getSchool() {
        return school;
    }

    //定义类的静态方法
    public static  void  printMsg(){
        System.out.println("你当前正在调用User类的静态方法");
    }
}
