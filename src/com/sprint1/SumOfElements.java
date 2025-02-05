package com.sprint1;

import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] arr = {1, 2, 3, 4, 5};
        int sum = 0;

        for(int num: arr){
            sum += num;
        }
        System.out.println("Sum of Numbers: " +sum);
    }
}
