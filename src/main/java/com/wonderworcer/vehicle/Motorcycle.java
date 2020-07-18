package com.wonderworcer.vehicle;

public class Motorcycle extends Vehicle {
    public Motorcycle(String name, int amountOfWheel, int maxSpeed, String uniqueStat) {
        super(name, amountOfWheel, maxSpeed, uniqueStat);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getAmountOfWheel() {
        return super.getAmountOfWheel();
    }

    @Override
    public void setAmountOfWheel(int amountOfWheel) {
        super.setAmountOfWheel(amountOfWheel);
    }

    @Override
    public int getMaxSpeed() {
        return super.getMaxSpeed();
    }

    @Override
    public void setMaxSpeed(int maxSpeed) {
        super.setMaxSpeed(maxSpeed);
    }

    @Override
    public String getUniqueStat() {
        return super.getUniqueStat();
    }

    @Override
    public void setUniqueStat(String uniqueStat) {
        super.setUniqueStat(uniqueStat);
    }
}
