package com.example.design.build;

import java.util.List;

public class BMWBuilder extends CarBuilder {
    private BMWModel bmwModel=new BMWModel();
    @Override
    public void setSequence(List<String> sequence) {
        bmwModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.bmwModel;
    }
}
