package com.sprint1;

import java.util.Scanner;

public class LCMOfNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int first = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int second= sc.nextInt();

        int g = 0;
        int lcm = 0;
        for(int i=1; i<= second; i++){
            if(first%i==0 && second%i == 0)
                g = i;
            lcm = (first*second)/g;
        }
        System.out.print("LCM = " +lcm);
    }
}
