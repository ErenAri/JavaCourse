package com.company;

public class Main {

    public static void main(String[] args) {
        String message = "Bugün hava çok güzel";
        System.out.println(message);

//        System.out.println("Eleman Sayısı = "+message.length());
//
//        System.out.println("5.eleman = "+message.charAt(4));
//
//        System.out.println(message.concat(" Yaşasın")); //mesajları birleştirir
//
//        System.out.println(message.startsWith("B"));
//
//        System.out.println(message.endsWith("c"));
//
//        char[] karakterler = new char[5];
//        message.getChars(0,5,karakterler,0);
//        System.out.println(karakterler);
//
//        System.out.println(message.indexOf("a"));
//
//        System.out.println(message.lastIndexOf("e"));

        System.out.println(message.substring(2,5));


    }
}
