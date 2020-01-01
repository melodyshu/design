package com.example.design.prototype;

public class ClientDeep {
    public static void main(String[] args) throws Exception {
        ThingDeep thingDeep=new ThingDeep();
        thingDeep.setValue("张三");
        System.out.println(thingDeep.getList());
        ThingDeep thingDeep2=thingDeep.clone();
        thingDeep2.setValue("李四");
        System.out.println(thingDeep.getList());
        System.out.println(thingDeep2.getList());

    }
}
