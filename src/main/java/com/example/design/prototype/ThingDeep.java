package com.example.design.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * 深拷贝
 */
public class ThingDeep implements Cloneable {
    private ArrayList<String> list=new ArrayList<>();

    @Override
    protected ThingDeep clone() throws CloneNotSupportedException {
        ThingDeep thingDeep= (ThingDeep) super.clone();
        thingDeep.list= (ArrayList<String>) this.list.clone();
        return thingDeep;
    }

    public List<String> getList() {
        return list;
    }

    public void setValue(String value) {
        list.add(value);
    }
}
