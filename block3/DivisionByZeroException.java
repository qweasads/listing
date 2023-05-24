package org.example;

public class DivisionByZeroException extends Throwable {

    public  String getMessage() {
        return "Деление на ноль запрещено!";
    }
}

