package com.company;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,5,7,9,0};
        int founder = 5;
        boolean isThere=false;

        for (int number:numbers){
            if (number==founder){
                isThere=true;
                break;
            }
        }
        if (isThere){
            System.out.println("Sayı mevcuttur");
        }else {
            System.out.println("Sayı mevcut değildir");
        }
    }
}
