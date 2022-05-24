package com.bridgelabz;
import java.util.Random;

class FlipCoin{
    public static void main(String[] args) {
        Random r = new Random();

        int tail = 0, head = 0, i = 0;
        while(i<20) {
            int check = r.nextInt(2);

            if (check == 0)
                tail++;
            else
                head++;
            i++;
        }
        System.out.println(head +" "+tail);
        float tailPercent = ((float)tail/20 * 100);
        float headPercent = ((float)head/20 * 100);
        System.out.println("percentage of head is "+headPercent);
        System.out.println("percentage of tail is "+tailPercent);

    }
}