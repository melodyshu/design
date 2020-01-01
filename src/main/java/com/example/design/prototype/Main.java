package com.example.design.prototype;

public class Main {
    public static void main(String[] args) throws Exception {
        long begin1=System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            new Computer();
        }
        long end1=System.currentTimeMillis();
        System.out.println("执行时间:"+(end1-begin1));

        begin1=System.currentTimeMillis();
        ComputerClone computerClone = new ComputerClone();
        for (int i = 0; i < 1000000-1; i++) {
            computerClone.clone();
        }
        end1=System.currentTimeMillis();
        System.out.println("执行时间:"+(end1-begin1));
    }
}
