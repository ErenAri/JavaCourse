package com.company;

public class Main {

    public static void main(String[] args) {
        String message = "Hello World";
        String newMessage = giveCity();
        System.out.println(newMessage);
        int number = plus(5,7);
        System.out.println(number);
    }

    public static void add(){
        System.out.println("added");
    }

    public static void delete(){
        System.out.println("deleted");
    }

    public static void update(){
        System.out.println("updated");
    }

    public static int plus(int number1,int number2){
        return number1+number2;
    }

    public static String giveCity(){
        return "Istanbul";
    }
}
