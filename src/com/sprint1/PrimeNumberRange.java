package com.sprint1;

import java.util.Scanner;

public class PrimeNumberRange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int a = sc.nextInt();

        System.out.println("Enter Second Number: ");
        int b = sc.nextInt();
        sc.close();

        FindPrimeNumber(a,b);


    }
    static void FindPrimeNumber(int a, int b){
        int i;
        for(i= a; i<b; i++){
            boolean flag = true;
            if(i<=1){
                flag = false;
            }else{
                for(int j=2; j<=Math.sqrt(i); j++){
                    if(i%j==0){
                        flag= false;
                        break;
                    }
                }
            }
            if(flag){
                System.out.println(i);
            }
            }


        }

        }




