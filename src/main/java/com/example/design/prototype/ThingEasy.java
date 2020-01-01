package com.example.design.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * 浅拷贝
 */
public class ThingEasy implements Cloneable {
    private List<String> list=new ArrayList<>();

    @Override
    protected ThingEasy clone() throws CloneNotSupportedException {
        return (ThingEasy) super.clone();
    }

    public List<String> getList() {
        return list;
    }

    public void setValue(String value) {
        list.add(value);
    }
}
