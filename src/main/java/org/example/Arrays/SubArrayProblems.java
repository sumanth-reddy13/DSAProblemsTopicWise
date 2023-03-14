package org.example.Arrays;

import java.util.HashMap;

public class SubArrayProblems {
    public static void main(String[] args) {
    /* Points To Remember:
        -> If you want the sum of every possible subArray in the given array, you can get it in O(N^2) TC. [Use 2 Nested Loops]
        -> Whereas, if you want to generate all the possible subArrays, then it takes O(N^3) TC.
    */
    }
    // Problem - 1 : SubArray Sum equals K  -> Leetcode 560
    //    Approach 1:  Prefix Sum approach takes O(N^2) Time Complexity.
    public int subArraySum(int[] nums, int k) {
        for (int i = 1;i < nums.length;i++) {
            nums[i] += nums[i - 1];
        }

        int cnt = 0;
        for (int i = 0;i < nums.length;i++) {
            if(nums[i] == k) cnt++;
            for (int j = 0;j < i;j++) {
                if (nums[i] - nums[j] == k) cnt++;
            }
        }
        return cnt;
    }

    /*
            -> Using HashMaps. This approach is derived from the above prefix sum approach.
            -> For every index i, instead of traversing from 0 to i-1th index, while traversing from start, we store the prefix
                sums in a hashTable.
            -> In prefix sum, we are doing prefix[i] - prefix[i-nth] to find the target.
            -> Here, in the 2nd approach, we are doing prefix[i] - target to find "prefix[i-nth]" one in the hashMap.
     */

    // Code below
    public static int subArraySum1(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int cnt = 0;

        for (int i = 0;i < nums.length;i++) {
            sum += nums[i];
            if (sum == k) cnt++;
            if (map.containsKey(sum - k)) {
                cnt += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return cnt;
    }

    /* Problem-2
        Given an array and a sum k, generate the subarray whose elements sum to k.
        Ex : arr = {2,1,3,4,5,6} k = 10.

        Use Slinding Window Approach
    */
    public static void sub(int[] arr, int k) {
        int s = 0, e = 0, sum = 0;

        while (s < arr.length) {
            while (e < arr.length && arr[e] + sum <= k) {
                sum += arr[e++];
            }
            if (sum == k) {
                for (int i = s;i<e;i++) System.out.print(arr[i] + " ");
                System.out.println();
            }
            sum -= arr[s];
            s++;
        }
    }

    /*
        Problem-3 -> Maximum Sum in subArrays.
        https://www.geeksforgeeks.org/maximum-sum-of-smallest-and-second-smallest-in-an-array/

        Easy problem but there is some observation which we have to do to get the answer in O(N) complexity.
     */




}
