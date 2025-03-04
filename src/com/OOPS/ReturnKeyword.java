package com.OOPS;

class IntDemo {
     public int getSum(int a, int b){
         int result = 0;
         result = a+b;
         return result;
     }
}

public class ReturnKeyword{
    public static void main(String[] args){
        IntDemo id = new IntDemo();
        int receive = id.getSum(10,20);
        System.out.println("Summ is: " +receive);
    }
}
