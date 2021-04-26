package com.company;

public class Main {

    public static void main(String[] args) throws ArrayIndexOutOfBoundsException, InterruptedException {

        //For Loop
        for (int i = 1;i<=10;i++){
	        System.out.println(i);
        }

	    String[] TopCities = {
	      "Istanbul",
          "Moscow",
          "St.Petersburg",
          "New York",
          "London",
          "Paris",
          "Hong Kong",
          "Pekin"
        };
        Thread.sleep(800);
	    for (int i = 0;i<=TopCities.length;i++){
	        System.out.println(i+". "+TopCities[i]);
        }

	    //While Loop
	    int i = 10;
	    while (i<10){
	        System.out.println(i);
	        i+=2;
        }

	    //DoWhile Loop
        int j=1;
        do{
            System.out.println(j);
            j+=2;
        }while (j<10);


    }
}
