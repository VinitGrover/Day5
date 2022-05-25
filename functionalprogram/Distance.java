package com.bridgelabz.functionalprogram;
import java.util.Scanner;

class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Two Numbers x and y : ");
        int x = sc.nextInt(), y = sc.nextInt();

        double z = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println(z);
    }
}