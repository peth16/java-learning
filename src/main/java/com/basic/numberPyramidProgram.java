package com.basic;

public class numberPyramidProgram {

    public static void main(String[] args){

        int rows = 6;

        for (int i=0; i<rows;i++){

            for (int j=rows-i;j>=1;j--){
                System.out.print(" ");
            }
            for (int k=1; k<=i;k++){
                System.out.print(k +" ");
            }
            System.out.println();
        }

    }

}
