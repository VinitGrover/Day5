package com.bridgelabz.functionalprogram;

import java.util.Scanner;

class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n rows and m columns : ");
        int n = sc.nextInt(), m= sc.nextInt();

        int arr[][] = new int[n][m];
        int count=1;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=count;
                count++;
            }
        }

        for(int [] x : arr){
            for(int y : x){
                System.out.print(y +" ");
            }
        }

    }
}