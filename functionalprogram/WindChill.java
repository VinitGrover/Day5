package com.bridgelabz.functionalprogram;
import java.util.Scanner;

class WindChill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter values of t and v : ");
        int t = sc.nextInt(), v = sc.nextInt();

        double w = 35.74 + 0.6125*t +Math.sqrt( 35.75 - 0.4275*t);

        System.out.println("The windchill in the area will be "+w);
    }
}