package com.basic;

/*
Widening Casting (automatically) - converting a smaller type to a larger type size
byte -> short -> char -> int -> long -> float -> double
Widening casting is done automatically when passing a smaller size type to a larger size type:
*/

public class Widening_TypeCasting {

    public static void main(String[] args){

        int myInt = 10;

        double  myDouble = myInt; //Automation Casting : int to double

        System.out.println(myInt);

        System.out.println(myDouble);

    }

}
