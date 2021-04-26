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
        String message="";
        if (isThere){
            GiveMessage("Sayı mevcuttur "+founder);
        }else {
            GiveMessage("Sayı mevcut değildir "+founder);
        }
    }

    public static void GiveMessage(String message){
        System.out.println(message);
    }
}
