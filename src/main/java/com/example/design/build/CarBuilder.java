package com.example.design.build;

import java.util.List;

public abstract class CarBuilder {
    public abstract void setSequence(List<String> sequence);
    public abstract CarModel getCarModel();
}
