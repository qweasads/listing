package org.example;
interface A {
    void metodA();
}
interface B extends A {
    void metodB();
}
public class IExampleDemo {
        public static void main(String[] args) {
            IExample ie = new IExample();
            ie.metodA();
            ie.metodB();
        }
    }

