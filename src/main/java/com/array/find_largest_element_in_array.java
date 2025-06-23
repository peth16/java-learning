package com.array;

public class find_largest_element_in_array {

    public static void main(String[] args) {

        int[] arr = {12};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] >= max) {
                max = arr[i];
            }

        }
        System.out.println(max);
    }

}
