package org.example.BitManipulations;

import java.util.ArrayList;
import java.util.List;

public class BitManipulation {
    public static void main(String[] args) {
//        Problem 1 -> Generate Power Set of a given array.
                generatePowerSet(3);

//        Problem - 2  -> generate PowerSet using BackTracking.
//                char[] ch = {'a', 'b' ,'c'};
//                List<String> powerSets = new ArrayList<>();
//                generatePowerSet(powerSets, ch, "", 0);
//                for (String s : powerSets) System.out.println(s);

//        Problem - 3 -> Single Number II Leetcode Link: (https://leetcode.com/problems/single-number-ii/description/)
//                singleNumberII(new int[]{2, 2, 2, 3});


    }

    public static void generatePowerSet(List<String> powerSets, char[] ch, String s, int index) {
        powerSets.add(s);

        if (index == ch.length) {
            return;
        }

        for (int i = index;i < ch.length;i++) {
            s += ch[i];
            generatePowerSet(powerSets, ch, s, i + 1);
            s = s.substring(0, s.length() - 1);
        }
    }
    public static void generatePowerSet(int n) {

        // The outer runs for 2^n times. Inner loop runs 'n' times for every ith iteration.
        // Therefore, the time complexity of this Algorithm is O(2^n * n).  Space Complexity = O(1).
        for (int i = 0;i < Math.pow(2, n);i++) {
            for (int j = 0;j < n;j++) {
                if ((i&(1<<j)) > 0) {
                    System.out.print( j+1 + " ");
                }
            }
            System.out.println();
        }
    }

    public static void singleNumberII(int[] nums) {

        // For every ith index, the freq of 1 bits should be multiple of 3 as they said every number occurs thrice in the array
        // If not, then single number is also present in the index.

        int shift = 1;
        int ans = 0;

        // Run the outer loop for 32 times to check the no Of bits at each index.

        for (int i = 0;i < 32; i++) {
            int count = 0;
            for (int j = 0;j < nums.length; j++) {
                if ((shift&nums[j]) != 0) count++;
            }
            if (count % 3 != 0) ans += shift;
            shift *= 2;
        }
        System.out.println(ans);
    }
}
