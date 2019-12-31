package com.example.design.javaobserver;

import java.util.Observable;
import java.util.Observer;

public class Wangsi implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("王斯:观察到韩非子活动:"+arg);
    }
}
