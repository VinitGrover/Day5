package com.bridgelabz;
import java.util.Scanner;

class VowelConstant{
    public static void main(String[] args) {
        System.out.print("Enter an Alphabet : " );
        Scanner sc = new Scanner(System.in);
        char check = sc.next().charAt(0);

        if(check == 'a' || check == 'e' || check == 'i' || check == 'o' || check == 'u'  )
            System.out.println(check +" is vowel");
        else
            System.out.println(check + " is consonant");
    }
}