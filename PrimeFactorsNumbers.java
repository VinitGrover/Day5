package com.bridgelabz;
import java.util.Scanner;

class PrimeFactorNumbers{
    public static void main(String[] args) {
        System.out.print("Enter Number to find it's prime factors : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=2; i<n; i++ ) {

            while(n%2==0){
                System.out.print(i + " ");
                n/=i;
            }
        }
        if(n>2){
            System.out.print(n);
        }
    }
}