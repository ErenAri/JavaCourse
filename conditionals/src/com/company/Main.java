package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	    int sayi = 20;
        if(sayi){

        }

        Scanner reader = new Scanner(System.in);
        System.out.print("Bir Sayı Girin: ");
        int number1 = reader.nextInt();
        int number2 = reader.nextInt();

        if (number1>number2){
            System.out.println(number1+" sayısı"+number2+" sayısından büyüktür");
        }
        else if(number1==number2){
            System.out.println(number1+" sayısı"+number2+" sayısına eşittir");
        }else{
            System.out.println(number1+" sayısı"+number2+" sayısından küçüktür");
        }
    }
}
