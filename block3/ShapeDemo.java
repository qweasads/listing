package org.example;

public class ShapeDemo {

    public static void main(String[] args) {
        Point p = new Point();
        Triangle t = new Triangle(5 ,3);
        Circle c = new Circle(9);
        Shape[] s ={p,t,c};

        System.out.println("Расчет площади фигур");
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i].toString() + ":" + s[i].area());
        }
    }
}
