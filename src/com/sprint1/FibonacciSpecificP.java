package com.sprint1;

import java.util.Scanner;

public class FibonacciSpecificP {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter digit");
        int num = sc.nextInt();

        FindNumber(num);

    }static void FindNumber(int num){
        int a = 0;
        int b =1;
        int next;
        int[] arr = new int[num+2];

        for(int i=0; i<=num; i++){
            arr[i] = a;
            next = a+b;
            a=b;
            b= next;
        }
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
