package com.example.design.factorymethod;

import java.util.HashMap;
import java.util.Map;

public class NvWa {
    public static void main(String[] args) {
        AbstractHumanFactory abstractHumanFactory=new HumanFactory();
        Human whiteHuman=abstractHumanFactory.creatHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();
        Human blackHuman=abstractHumanFactory.creatHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
        Human yellowHuman=abstractHumanFactory.creatHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();

        Map map1=new HashMap();
        map1.put(null,null);
        System.out.println(map1.get(null));
        System.out.println(map1.size());

    }
}
