package com.company;

public class Main {

    public static void main(String[] args) {
        NumberFounder();
    }

    public static void NumberFounder(){
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
            GiveMessage(founder);
        }else {
            System.out.println("Sayı mevcut değildir "+founder);
        }
    }

    public static void GiveMessage(int founder){
        System.out.println("Sayı mevcuttur "+founder);
    }
}
