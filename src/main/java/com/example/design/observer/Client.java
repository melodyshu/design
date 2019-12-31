package com.example.design.observer;

public class Client {
    public static void main(String[] args) {
        Observer liSi = new LiSi();
        Observer wangSi = new Wangsi();
        Observer liuSi = new Liusi();
        HanFeiZi hanFeiZi = new HanFeiZi();
        //向被观察者注册观察者
        hanFeiZi.addObserver(liSi);
        hanFeiZi.addObserver(wangSi);
        hanFeiZi.addObserver(liuSi);
        hanFeiZi.haveBreakfast();
        hanFeiZi.haveFun();
    }
}
