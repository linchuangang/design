package com.lin.single;

//懒汉式，线程安全
//是否 Lazy 初始化：是
//
//是否多线程安全：是
//
//实现难度：易
public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

//1、懒汉式，线程不安全
//是否 Lazy 初始化：是
//
//是否多线程安全：否
//
//实现难度：易
class Singleton2 {
    private static Singleton2 instance;

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}