package com.example.design.strategy;

public class Client {
    public static void main(String[] args) {
        Context context=new Context(new BackDoor());
        context.operate();
        context=new Context(new GivenGreenLight());
        context.operate();
        context=new Context(new BlockEnemy());
        context.operate();
    }
}
