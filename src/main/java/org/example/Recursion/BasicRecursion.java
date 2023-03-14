package org.example.Recursion;

import java.util.Arrays;

public class BasicRecursion {
    public static void main(String[] args) {
    /*
        print1toN(5);
        printGfg(5);

     */
        int[] arr = {1,2,3,4,5,6};
        reverseArray(arr);
        System.out.print(Arrays.toString(arr));
    }

    // problem - 1
    public static void print1toN(int n) {
        if (n > 0) {
            print1toN(n-1);
            System.out.print(n + " ");
        }
        // TC -> O(N) as we are recursively going from N to 0.
        // SC -> O(N) as the calls are stored in the stack.
    }

    // problem - 2
    public static void printGfg(int N) {
        if (N > 0) {
            System.out.print("GFG ");
            printGfg(N-1);
        }
    }

    /*
        problem - 3
        https://practice.geeksforgeeks.org/problems/find-all-factorial-numbers-less-than-or-equal-to-n3548/0?problemType=functional&difficulty[]=-1&page=1&query=problemTypefunctionaldifficulty[]-1
    */

    /* problem - 4  Reverse a given array using Recursion.
         Brute Force Approach - Take an extra array of given array size. Traverse from the back and allocate values in the
                            extra array.
         Another Approach -> Take s = 0 and end = arr.length - 1. Swap both s and end until s < e.
    */
    public static void reverseArray(int[] arr) {

        reverse(arr, 0, arr.length-1);
    }
    private static void reverse(int[] arr, int i, int n) {
        if (i < n) {
            int temp = arr[i];
            arr[i] = arr[n];
            arr[n] = temp;
            reverse(arr, i+1, n-1);
        }
//        if (i <= n/2) {
//            int temp = arr[i];
//            arr[i] = arr[n-i-1];
//            arr[n-i-1] = temp;
//            reverse(arr, i+1, n);
//        }
    }
}
