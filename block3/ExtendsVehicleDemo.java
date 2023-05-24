package org.example;

 class ExtendsVehicleDemo {

    public static void main(String[] args) {

        Auto bmw = new Auto();
        bmw.sunroof = true;

        System.out.println("Путь, пройденный за 1.5 часа:" + bmw.distance(1.5) + " км.");

        System.out.println("Max.скорость:" + bmw.getMaxSpeed() + " км.");

        System.out.println("Наличие люка: " + bmw.sunroof);

    }

}

