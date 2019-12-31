package com.example.design.observer;

import java.util.ArrayList;
import java.util.List;

public class HanFeiZi implements IHanFeiZi,Observable {

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
    public void addObserver(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyObservers(String content) {
        for (Observer observer : observerList) {
            observer.update(content);
        }
    }
}
