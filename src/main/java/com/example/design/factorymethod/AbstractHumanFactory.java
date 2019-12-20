package com.example.design.factorymethod;

public abstract class AbstractHumanFactory {
    public abstract <T extends Human> T creatHuman(Class<T> c);
}
