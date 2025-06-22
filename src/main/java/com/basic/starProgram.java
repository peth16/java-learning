package com.basic;

public class starProgram {

    public static void main(String[] args){

        starProgram m = new starProgram();

        m.reverseStarProgram();

    }

    public void reverseStarProgram(){

        for(int i=0; i<=4; i++){

            for (int j=i; j<=4; j++){

                System.out.print("*");

            }
            System.out.println();
        }

    }

}
