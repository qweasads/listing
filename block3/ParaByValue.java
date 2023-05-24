package org.example;

class ParaByValue {

    void callByVal (int x, int y) {
        x = x + y;
        y = y + 1;
        System.out.println("x =" + x);
        System.out.println("y =" + y);
    }

}
