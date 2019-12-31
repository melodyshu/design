package com.example.design.build;

import java.util.List;

public class BenzBuilder extends CarBuilder {
    private BenzModel benzModel=new BenzModel();
    @Override
    public void setSequence(List<String> sequence) {
        benzModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.benzModel;
    }
}
