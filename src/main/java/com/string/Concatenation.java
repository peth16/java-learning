package com.string;

/*
String Concatenation
The + operator can be used between strings to combine them. This is called concatenation:
 */

public class Concatenation {

    public static void main(String[] args){

        String  FirstName = "Peth";
        String  LastName = "Aravind";

        System.out.println(FirstName + " " + LastName); //Without concatenation

        System.out.println(FirstName.concat(LastName));

    }

}
