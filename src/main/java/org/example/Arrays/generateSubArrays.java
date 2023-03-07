package org.example.Arrays;

import java.util.ArrayList;
import java.util.List;

public class generateSubArrays {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        // slidingWindow(nums, 1);
        //bruteForce(nums);
        // recursive(nums, 0, nums.length);
        generateAllSubarrays(nums);
    }


    // Firstly ->  N + (N-1) + (N-2) + (N-3) + (N-4) + ...... 1  is equal to (N*(N+1)/2)
    // 5 + 4 + 3 + 2 + 1 = 15   It is same as (5*(5+1)/2) = 15.

    public static void bruteForce(int[] nums) {
        int n = nums.length;

        for (int i = 0;i < n;i++) {
            for (int j = i;j < n;j++) {
                for (int k = i;k <= j;k++) {
                    System.out.print(nums[k] + " ");
                }
                System.out.println();
            }
        }

        // Time Complexity : The TC of the bruteForce approach is O(N^3).
    }

    public static void slidingWindow(int[] nums, int k) {
        // slidingWindow can be used to generate all the subarrays in the given array of a fixed size.

        int n = nums.length;
        for (int i = 0;i <= n-k;i++) {
            for (int j = i;j < i+k; j++) {
                System.out.print(nums[j] + " ");
            }
            System.out.println();
        }

        // Time Complexity: If you are generating subarrays for size k. Then the time complexity will be O((N-k+1)*k).
        // If you want to generate all the possible subarrays in the array. Then TC is O(N^3).
    }

    public static void recursive(int[] nums, int s, int e) {
        if (s < e) {
            twoLoop(nums, s);
            recursive(nums, s+1, e);
            // for (int j = s;j< nums.length;j++) {
            //     for (int k = s;k <= j;k++) {
            //         System.out.print(nums[k] + " ");   // This is also the recursive approach.
            //     }
            //     System.out.println();
            // }
            // recursive(nums, s+1, e);
        }

        // recursive approach is same as the bruteForce iterative approach. Here, we traverse the outer-most loop recursively.
    }

    // The below two functions are for the 2nd and 3rd loop that I need in recursion to solve it recursively.
    public static void twoLoop(int[] nums, int s) {
        for (int i = s;i < nums.length;i++) {
            threeLoop(nums, s, i);
        }
    }

    public static void threeLoop(int[] nums, int s, int k) {
        for (int i = s; i <= k;i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void generateAllSubarrays(int[] arr) {
        int n = arr.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = prefixSum[j] - prefixSum[i] + arr[i];
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }

    public static void generateSubArrays(int[] nums) {
        int n = nums.length;
//        for (int i = 0;i < n;i++) {
//            for (int j = i;j<n;j++) {
//                for (int k = i;k <= j;k++) {
//                    System.out.print(nums[k] + " ");
//                }
//                System.out.println();
//            }
//        }

        // the below approach takes O(N^2) TC and O(N) SC.
        List<Integer> list = new ArrayList<>();
        for (int i = 0;i < n;i++) {
            for (int j = i;j < n;j++) {
                list.add(nums[j]);
                System.out.println(list);
            }
            list.clear();
        }
    }


}
