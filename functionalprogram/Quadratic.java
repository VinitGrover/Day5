package com.bridgelabz.functionalprogram;
import java.util.Scanner;

class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Numbers a, b & c in equation to get the roots of quadratic equation : ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        double delta = (Math.pow(b,2) -(4*a*c) );
        System.out.println(delta);

        double root1 = (-b + Math.sqrt(delta))/(2*a);
        double root2 = (-b - Math.sqrt(delta))/(2*a);

        System.out.println("Roots of equation a*x*x +b*c +c is : " +root2+" "+root1 );
    }
}