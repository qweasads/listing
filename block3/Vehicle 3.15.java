package org.example;

public class Vehicle {
    int passengers;
    int wheels;
    public int maxspeed;
    int burnup;

    Vehicle() {
        this.passengers = 4;
        this.wheels = 4;
        this.maxspeed = 160;
        this.burnup = 13;
    }
    Vehicle(int passengers, int wheels, int maxspeed, int burnup) {
        this.passengers = passengers;
        this.wheels = wheels;
        this.maxspeed = maxspeed;
        this.burnup = burnup;
    }

}