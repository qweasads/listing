package org.example;

public class VehicleGetSetMethod {
    public static void main(String[] args) {

        Vehicle ferrari = new Vehicle(2, -2, 360, 12);
        System.out.println(" Мах скорость: " + ferrari.getWheels());

        ferrari.setWheels(4);
        System.out.println("Число колес (повторно): " + ferrari.getWheels());
    }
}
