package com.sprint1;

import java.util.*;
public class PrimeNoChecker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num, i;
        num = sc.nextInt();
        boolean flag = true;
        for(i=2; i< num; i++){
            if(num%i == 0){
                flag = false;
                System.out.println("This is not a Prime Number");
                break;
            }
            }
        if(flag) {
            System.out.println("This is a Prime Number");}
        }
    }

