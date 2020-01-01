package com.example.design.prototype;

/**
 * 构造函数不会被执行
 */
public class ClientMain {
    public static void main(String[] args) throws Exception {
        Thing thing=new Thing();
        Thing thing2=thing.clone();
    }
}
