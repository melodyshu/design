package com.example.design.prototype;

public class ComputerClone implements Cloneable{
    private String monitor;
    private String keyborad;
    private String motherborad;
    private String cpu;

    @Override
    protected ComputerClone clone() throws CloneNotSupportedException {
        return (ComputerClone) super.clone();
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public String getKeyborad() {
        return keyborad;
    }

    public void setKeyborad(String keyborad) {
        this.keyborad = keyborad;
    }

    public String getMotherborad() {
        return motherborad;
    }

    public void setMotherborad(String motherborad) {
        this.motherborad = motherborad;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
}
