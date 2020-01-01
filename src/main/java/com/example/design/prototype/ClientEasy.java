package com.example.design.prototype;

public class ClientEasy {
    public static void main(String[] args) throws Exception {
        ThingEasy thingEasy=new ThingEasy();
        thingEasy.setValue("张三");
        System.out.println(thingEasy.getList());
        ThingEasy thingEasy2=thingEasy.clone();
        thingEasy2.setValue("李四");
        System.out.println(thingEasy.getList());
        System.out.println(thingEasy2.getList());

    }
}
