package com.company;

public class Main {

    public static void main(String[] args) {
        String[][] Cities = new String[3][3];

        Cities[0][0]="Istanbul";
        Cities[0][1]="Bursa";
        Cities[0][2]="Bilecik";
        Cities[1][0]="Ankara";
        Cities[1][1]="Konya";
        Cities[1][2]="Kayseri";
        Cities[2][0]="Diyarbakır";
        Cities[2][1]="Şanlıurfa";
        Cities[2][2]="Gaziantep";

        for (int i=0;i<=2;i++){
            System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
            for (int j=0;j<=2;j++){
                System.out.println(Cities[i][j]);
            }
        }
    }
}
