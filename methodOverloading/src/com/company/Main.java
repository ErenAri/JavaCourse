package com.company;

public class Main {

    public static void main(String[] args) {
        FourOperation calculator = new FourOperation();
        System.out.println("Operation 1: "+calculator.plus(2,3));
        System.out.println("Operation 2: "+calculator.plus(2,3,4));
    }
}
