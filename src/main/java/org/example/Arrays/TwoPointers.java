package org.example.Arrays;

import java.util.Arrays;

public class TwoPointers {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
//        problem2(arr, 5);
        int[] arr1 = {4,5,4,6,6,5,5,4,6};
        DNF(arr1);
        System.out.println(Arrays.toString(arr1));
    }
    /*
        Problem-1 -> Max Consecutive Ones
        Link ->  https://leetcode.com/problems/max-consecutive-ones/description/
     */

    /*
        Problem-2 ->  Maximize Number of 1's
        https://practice.geeksforgeeks.org/problems/maximize-number-of-1s0905/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=maximize-number-of-1s
     */

    /*
        Problem-3 -> Sort Colors  (LC - 75)  [Dutch National Flag Algorithm]
     */


    public static int problem2(int[] arr, int m) {
        int n = arr.length;
        int cnt = 0;
        int start = 0;
        int max = 0;

        for (int end = 0; end < n; end++) {
            if (arr[end] == 0) cnt++;

            while (cnt > m) {
                if (arr[start] == 0) cnt--;
                start++;
            }
            max = Math.max(max, end - start + 1);
        }
        return max;
    }

    public static void DNF(int[] nums) {
        int n = nums.length;
        int zero = 0;
        int two = n-1;

        int i = 0;
        while (i <= two) {
            if (nums[i] == 4) {
                int temp = nums[zero];
                nums[zero] = nums[i];
                nums[i] = temp;
                zero++;
                i++;
            }
            else if (nums[i] == 6) {
                int temp = nums[two];
                nums[two] = nums[i];
                nums[i] = temp;
                two--;
            }
            else {
                i++;
            }
        }
    }

}
