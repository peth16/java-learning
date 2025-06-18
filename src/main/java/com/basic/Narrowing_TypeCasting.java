package com.basic;

/*
Narrowing Casting (manually) - converting a larger type to a smaller size type
double -> float -> long -> int -> char -> short -> byte

Narrowing casting must be done manually by placing the type in parentheses () in front of the value:
*/

public class Narrowing_TypeCasting {

    public static void main(String[] args){

        double  myDouble = 2.99d;

        int myInt = (int) myDouble;  //Manually Casting : double to int

        System.out.println(myDouble);

        System.out.println(myInt);

    }

}
