package org.example;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double leng,width,area;
        ArrayList<String>  myArray = new ArrayList<>();
        Scanner myScanner  = new Scanner(System.in);

        System.out.println(" How many walls would you like to calculated? ");
        int Loop = myScanner.nextInt();

        for(int q =0;q < Loop;q++ ) {
            System.out.println(" Enter height of wall ");
            leng = myScanner.nextDouble();
            System.out.println(" Enter width of wall ");
            width = myScanner.nextDouble();
            area = leng * width;

            System.out.println(" Is there a Socket or window True or False ");
            boolean a = myScanner.nextBoolean();
            if (a) {
                System.out.println(" Enter height of wall ");
                double len = myScanner.nextDouble();
                System.out.println(" Enter width of wall ");
                double wid = myScanner.nextDouble();
                area -= (len * wid);
            }
            System.out.println(" How many sqrt feet can your paint bucket cover");
            double bucket = myScanner.nextDouble();

            System.out.println(" How many liters in a bucket of paint ");
            double z = myScanner.nextDouble();

            myArray.add(" You will need "+ (area / bucket)+" liters of paint  to  cover the wall of "+ area + " You will need "+ (area/bucket)/z + " buckets \n");

        }
        System.out.println(myArray);
    }
}