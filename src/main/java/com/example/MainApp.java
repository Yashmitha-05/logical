package com.example;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("AND: " + LogicOperations.andOp(true, true));
        System.out.println("OR: " + LogicOperations.orOp(true, false));
        System.out.println("NOT: " + LogicOperations.notOp(false));
    }
}
