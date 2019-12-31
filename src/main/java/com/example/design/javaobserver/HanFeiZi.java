package com.example.design.javaobserver;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class HanFeiZi extends  Observable implements IHanFeiZi{

    private List<Observer> observerList=new ArrayList<>();

    @Override
    public void haveBreakfast() {
        System.out.println("韩非子:开始吃早餐了...");
        this.notifyObservers("韩非子在吃早餐");
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子:开始娱乐了...");
        this.notifyObservers("韩非子在娱乐");
    }

    @Override
    public synchronized void addObserver(Observer o) {
        this.observerList.add(o);
    }

    @Override
    public synchronized void deleteObserver(Observer o) {
        this.observerList.remove(o);
    }

    @Override
    public void notifyObservers(Object arg) {
        for (Observer observer : observerList) {
            observer.update(null,arg);
        }
    }
}
