package com.epam.mjc.stage0;

public class Animal {

    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        String pawsStr = numberOfPaws == 1 ? "paw" : "paws";
        String furStr = hasFur ? "a fur" : "no fur";
        return "This animal is mostly " + color + ". It has " + numberOfPaws + " " + pawsStr + " and " + furStr + ".";
    }
}
