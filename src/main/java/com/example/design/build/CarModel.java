package com.example.design.build;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class CarModel {
    private List<String> sequence=new ArrayList<>();
    protected abstract void start();
    protected abstract void stop();
    protected abstract void alarm();
    protected abstract void engineBoom();
    final public void setSequence(List<String> sequence){
        this.sequence=sequence;
    }
    final public void run(){
        Iterator<String> iterator = this.sequence.iterator();
        for (String s : sequence) {
            if(s.equalsIgnoreCase("start")){
                this.start();
            }else if (s.equalsIgnoreCase("stop")){
                this.stop();
            }else if(s.equalsIgnoreCase("alarm")){
                this.alarm();
            }else if(s.equalsIgnoreCase("engin boom")){
                this.engineBoom();
            }
        }
    }
}
