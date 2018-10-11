package com.lin.single;


//3、饿汉式
//是否 Lazy 初始化：否
//
//是否多线程安全：是
//
//实现难度：易
public class Singleton3 {
    private static Singleton3 instance = new Singleton3();

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        return instance;
    }
}
