package com.example.design.observer;

public class LiSi implements Observer {

    @Override
    public void update(String content) {
        System.out.println("李斯:观察到韩非子活动:"+content);
    }
}
