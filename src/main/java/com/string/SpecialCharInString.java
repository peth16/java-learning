package com.string;

public class SpecialCharInString {

    public static void main(String[] args){

        String txt = "It\'s alright.";  /*The sequence \"  inserts a double quote in a string:*/
        String txt1 = "We are the so-called \"Vikings\" from the north."; /*The sequence \'  inserts a single quote in a string:*/
        String txt2 = "The character \\ is called backslash.";

        System.out.println(txt);
        System.out.println(txt1);
        System.out.println(txt2);

    }

}
