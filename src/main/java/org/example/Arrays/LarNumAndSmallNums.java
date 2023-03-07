package org.example.Arrays;

public class LarNumAndSmallNums {
    public static void main(String[] args) {

    }

    // problem - 1   -> Find second-largest distinct element from an array.
    public static int secondLargest(int[] arr, int n) {
        if (n == 1) return -1;

        int max = 0;
        int secMax = -1;

        for (int num : arr) {
            if (num > max) {
                secMax = max;
                max = num;
            }
            else if (num > secMax && num != max) {
                secMax = num;
            }
        }
        if (secMax == 0) return -1;
        return secMax;
    }
}
