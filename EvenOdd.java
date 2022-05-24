package com.bridgelabz;
import java.util.Scanner;

class EvenOdd{
    public static void main(String[] args) {
        System.out.print("Enter a number : " );
        Scanner sc = new Scanner(System.in);
        int check = sc.nextInt();

        if(check%2==0)
            System.out.println("number is even");
        else
            System.out.println("number is odd");

    }
}