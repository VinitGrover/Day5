package com.bridgelabz;
import java.util.Scanner;

class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter power of 2 : ");
        int n = sc.nextInt();

        int mul=2,i=1;

        while(i<n){
            mul = mul*2;
            i++;
        }

        System.out.println("Power of 2 is :"+mul);

        if (mul % 4 == 0 || mul % 400 == 0)
            System.out.println(mul + " is a leap year");
        else
            System.out.println(mul + " is not a leap year");
    }
}
