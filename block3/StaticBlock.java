package org.example;

public class StaticBlock {
    static double rootOf9;
    static double rootOf27;
    int number;
    static {
        System.out.println("Инциализация статических членов класс....");
        rootOf9 = Math.sqrt(9.0);
        rootOf27 = Math.sqrt(27.0);
    }

    StaticBlock(int number) {
        System.out.println("Инциализация переменных экземпляра класс....");
        this.number=number;
    }
}
