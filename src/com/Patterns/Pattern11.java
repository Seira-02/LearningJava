package com.Patterns;

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows: ");
        int num = sc.nextInt();

        ForPattern(num);
    }

    static void ForPattern(int num){
        int start;

        for(int i =1; i<=num; i++){
            if(i%2==0){
                start = 1;
            }else{
                start = 0;
            }
            for(int j = 1; j<=i; j++){
                start = 1-start;
                System.out.print(start);
            }
            System.out.println();
        }

    }
}
