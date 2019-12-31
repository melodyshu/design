package com.example.design.observer;

public class Liusi implements Observer {
    @Override
    public void update(String content) {
        System.out.println("刘斯:观察到韩非子活动:"+content);
    }
}
