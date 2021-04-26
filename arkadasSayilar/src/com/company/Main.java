package com.company;

public class Main {

    public static void main(String[] args) {
        int number1 = 220;
        int number2 = 284;
        int plus1 = 0;
        int plus2 = 0;

        for (int i = 1; i<number1;i++){
            if (number1%i==0){
                plus1 = plus1+i;
            }
        }

        for (int i = 1; i<number2;i++){
            if (number2%i==0){
                plus2 = plus2+i;
            }
        }

        if (number1==number2&&number2==plus1){
            System.out.println("Bu iki sayı arkadaştır");
        }
        else {
            System.out.println("Bu iki sayı arkadaş değildir");
        }
    }
}
