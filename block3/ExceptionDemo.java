package org.example;

public class ExceptionDemo {
    private static double divide(double dividend, double divisor)
            throws DivisionByZeroException {

        if (divisor == 0)
            throw new DivisionByZeroException();
        return dividend / divisor;
    }

    public static void main(String[] args) {
        try {
            divide(8, 0);
        } catch (DivisionByZeroException dz) {
            System.out.println(dz.getMessage());
        }
    }
}
