package org.example;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static double getUserinput(double x){
        Scanner myScanner  = new Scanner(System.in);
        x = myScanner.nextDouble();
        return x;
    }
    public static int getUserinput(int x){
        Scanner myScanner  = new Scanner(System.in);
        x = myScanner.nextInt();
        return x;
    }
    public static boolean getUserinput(boolean x){
        Scanner myScanner  = new Scanner(System.in);
        x = myScanner.nextBoolean();
        return x;
    }
    public static void main(String[] args) {
        double leng= 0,width= 0,len = 0,wid = 0,bucket = 0, z = 0;
        boolean a = false;
        int Loop= 0;
        ArrayList<String>  myArray = new ArrayList<>();


        System.out.println(" How many walls would you like to calculated? ");
        Loop = getUserinput(Loop);

        for(int q =1;q <=Loop;q++ ) {
            System.out.println(" Enter height of Wall "+ q);
            leng = getUserinput(leng);
            System.out.println(" Enter width of Wall "+q);
            width = getUserinput(width);
            double area = leng * width;

            System.out.println(" Is there a Socket or window True or False ");
            a = getUserinput(a);
            if (a) {
                System.out.println(" Enter height of Socket or Window "+q);
                len = getUserinput(len);
                System.out.println(" Enter width of Socket or Window "+q);
                len = getUserinput(wid);
                area -= (len * wid);
            }
            System.out.println(" what is the coverage of your paint Bucket");
            bucket = getUserinput(bucket);

            System.out.println(" How many liters in a bucket of paint ");
            z = getUserinput(z);
            myArray.add(" You will need "+ (area / bucket)+" liters of paint  to  cover the wall of "+ area + " You will need "+ (area/bucket)/z + " buckets \n");

        }
        System.out.println(myArray);
    }
}