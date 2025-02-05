package com.sprint1;

import java.util.Scanner;

public class LargestSmallest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {4, 7, 1, 8, 5};
        int largest = arr[0];
        int smallest = arr[0];

        for(int i = 0; i< arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        System.out.println("Largest Number is: " +largest);
        System.out.println("Smallest Number is: " +smallest);

    }
}
