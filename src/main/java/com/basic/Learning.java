package com.basic;

public class Learning {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5};
        int n=5;// n = 5, so missing number is 3
        for (int i=1; i<n;i++){
                if(arr[i-1]!=i){
                    System.out.print("Missing Number is " + i);
                    i++;
                }
        }

    }

}
