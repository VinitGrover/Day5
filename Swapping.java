package com.bridgelabz;
import java.util.Scanner;

class Swapping{
    public static void main(String[] args) {
        System.out.print("Enter first number : " );
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();

        int temp = a;
        a=b;
        b=temp;

        System.out.println("After swapping numbers, first number is : "+a+" and second number is : "+b );

    }
}