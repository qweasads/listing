package org.example;

public class StaticBlockDemo {
    public static void main(String[] args) {
        System.out.println("Корень из 9 равен" + StaticBlock.rootOf9);
        System.out.println("Корень из 27 равен" + StaticBlock.rootOf27);

        StaticBlock sb1 = new StaticBlock(4);
        System.out.println("sb1.number ="+ sb1.number);

        StaticBlock sb2 = new StaticBlock(16);
        System.out.println("sb1.number ="+ sb2.number);

    }
}
