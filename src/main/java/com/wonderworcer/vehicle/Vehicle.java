package com.wonderworcer.vehicle;

public class Vehicle {
    private String name;
    private int amountOfWheel;
    private int maxSpeed;
    private String uniqueStat;


    public Vehicle(String name, int amountOfWheel, int maxSpeed, String uniqueStat) {
        this.name = name;
        this.amountOfWheel = amountOfWheel;
        this.maxSpeed = maxSpeed;
        this.uniqueStat = uniqueStat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountOfWheel() {
        return amountOfWheel;
    }

    public void setAmountOfWheel(int amountOfWheel) {
        this.amountOfWheel = amountOfWheel;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getUniqueStat() {
        return uniqueStat;
    }

    public void setUniqueStat(String uniqueStat) {
        this.uniqueStat = uniqueStat;
    }
}
