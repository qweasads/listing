package org.example;

public class Basket {

    void pay(double money, int i) {
        System.out.println("Оплачено налчными:" + money);
    }

    void pay(String carfNum) {
        System.out.println("Оплачено по кредитной карте #" + carfNum);
    }

    void pay(String accountNum, String bankCode) {
        System.out.println("Переведено на счет #" + accountNum + " в банке " + bankCode);
    }
    }


