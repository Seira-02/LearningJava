package com.sprint1;

public class ContinueDemo1 {
    public static void main(String[] args){
        int i,j;
        for (i=1; i<=5; i++){
            for(j=1; j<=3; j++){
                if(i*j>10)
                    continue;
                System.out.print(i*j+ " ");

            }
            System.out.println();
        }
    }
}
