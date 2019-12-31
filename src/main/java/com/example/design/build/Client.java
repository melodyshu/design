package com.example.design.build;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<String> sequence=new ArrayList<>();
        sequence.add("start");
        sequence.add("alarm");
        sequence.add("engin boom");

        BenzBuilder benzBuilder=new BenzBuilder();
        benzBuilder.setSequence(sequence);
        BenzModel benzModel = (BenzModel) benzBuilder.getCarModel();
        benzModel.run();
    }
}
