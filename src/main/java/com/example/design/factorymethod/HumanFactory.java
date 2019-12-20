package com.example.design.factorymethod;

public class HumanFactory extends AbstractHumanFactory {
    @Override
    public <T extends Human> T creatHuman(Class<T> c) {
        Human human=null;
        try {
            human= (T)Class.forName(c.getName()).newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }

        return (T)human;
    }
}
