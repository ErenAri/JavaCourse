package com.company;

public class Main {

    public static void main(String[] args) {
        int number = 25;
        int remainder = number % 2;
        System.out.println(remainder);
        boolean isPrime=true;

        if (number==1){
            System.out.println("Sayı asal değildir");
        }

        if (number<1){
            System.out.println("Geçersiz sayı");
        }

        for (int i=2;i<number;i++){
            if (number%2==0){
                isPrime=true;
            }
        }
    }
}
