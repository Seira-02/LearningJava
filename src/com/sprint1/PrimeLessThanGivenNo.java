package com.sprint1;

import java.util.Scanner;

public class PrimeLessThanGivenNo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        FindPrime(num);
    }
    static void FindPrime(int num){
        int i;
        for(i= 0; i<num; i++){
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
                System.out.print(i + "  ");
            }

        }


    }
}

