package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Üç Tane Sayı Girin: ");

        int sayi1 = reader.nextInt();
        int sayi2 = reader.nextInt();
        int sayi3 = reader.nextInt();

        if (sayi1>sayi2){
            if (sayi1>sayi3){
                System.out.println("Sayı 1 en büyük");
            }else {
                System.out.println("Sayı 3 en büyük");
            }
        }else if(sayi2>sayi1){
            if (sayi2>sayi3){
                System.out.println("Sayı 2 en büyüktür");
            }else {
                System.out.println("Sayı 3 en büyüktür");
            }
        }else{
            System.out.println("Sayı 3 en büyüktür");

        }

    }
}
