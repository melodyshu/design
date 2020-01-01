package com.example.design.prototype;

public class Thing implements Cloneable {
    public Thing() {
        System.out.println("Thing构造函数被执行了");
    }

    @Override
    protected Thing clone() throws CloneNotSupportedException {
        return (Thing) super.clone();
    }
}
