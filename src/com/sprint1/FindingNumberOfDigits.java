package com.sprint1;

import java.util.Scanner;

public class FindingNumberOfDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        FindDigits(num);
    }
    static void FindDigits(int num){
        int count = 0;
        while(num>0){
            num = num/10;
            count ++;
        }
        System.out.println(count);

    }


}
