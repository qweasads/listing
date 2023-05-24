package org.example;

public class VehicleOverrideDemo {

    public static void main(String[] args) {

        Vehicle v = new Vehicle(2, 2, 100, 9);
        Auto a = new Auto(2, 4, 180, 12, true);
        System.out.println("Vehicle.toString():" + v.toSting());
        System.out.println("Auto.toString():" + a.toSting());

    }
    }

