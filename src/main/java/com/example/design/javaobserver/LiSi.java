package com.example.design.javaobserver;

import java.util.Observable;
import java.util.Observer;

public class LiSi implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("李斯:观察到韩非子活动:"+arg);
    }
}
