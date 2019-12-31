package com.example.design.build;

public class BMWModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("宝马跑起来是这个样子的...");
    }

    @Override
    protected void stop() {
        System.out.println("宝马这样停车...");
    }

    @Override
    protected void alarm() {
        System.out.println("宝马的喇叭声音是这个样子的...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("宝马的引擎是这个声音...");
    }

}
