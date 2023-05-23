package org.example;

public class Laptop {
    private String model;
    private int ram;
    private int hdd;
    private String os;
    private String color;
    public Laptop(String model, int ram, int hdd, String os, String color){
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
    }
    public String getModel() {
        return model;
    }
    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Model: " + model + " / RAM: " + ram + "GB / HDD: " + hdd + "GB / OS: " + os + " / color: " + color;
    }


}
