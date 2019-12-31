package com.example.design.observer;

public class Wangsi implements Observer {
    @Override
    public void update(String content) {
        System.out.println("王斯:观察到韩非子活动:"+content);
    }
}
