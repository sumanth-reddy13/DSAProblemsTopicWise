package org.example.Arrays;

import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {

    }

    // Problem-1
    public static boolean checkSortedOrNot(int[] nums){
        int n = nums.length;
        int flag = 0;
        int flagCount = 0;

        for (int i = 0;i < n-1;i++) {
            if (nums[i] > nums[i+1]) {
                flag = 1;
                flagCount++;
            }
        }
        if (flag == 0) return true;
        if (nums[0] >= nums[n-1] && flagCount == 1) return true;
        return false;
    }

    /*    This is the Optimized Approach  -> O(N) Time Complexity

            int n = nums.length;
            int flag = 0;
            int flagCount = 0;

            for (int i = 0;i < n-1;i++) {
                if (nums[i] > nums[i+1]) {
                    flag = 1;
                    flagCount++;
                }
            }
            if (flag == 0) return true;
            if (nums[0] >= nums[n-1] && flagCount == 1) return true;
            return false;
     */

     /*
            I like this solution. Short & Crisp -> If sorted array is rotated, we will come across only one break point. That
            is, arr[i] > arr[i+1].
            Traverse the array and check for the break points, if there are more than one breakpoints then the array is not
            sorted.

            Below is the Code.
                int n = nums.length;
                int breakPoint = 0;

                for (int i = 0;i < n;i++) {
                    if (nums[i] > nums[(i+1)%n]) {
                        breakPoint++;
                    }
                }
                return (breakPoint<=1);
      */

    // Problem - 2

    /*
           -> Rotate an array by to the left by one place
           -> Rotate an array to the left by K places.
     */

    /*
      Rotate the array k times
  */
    public static void rotateKTimes(int[] nums, int k) {

        // This one is O(N) TC without any extra space.
        System.out.println(Arrays.toString(nums));

        swap(nums, 0, nums.length-1);
        swap(nums, 0, k-1);
        swap(nums, k, nums.length-1);

        System.out.print(Arrays.toString(nums));
    }
    private static void swap(int[] nums, int s, int e) {
        while (s < e) {
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
    }

    /*
        Another Approach: We take a copy array of the given array. ith index in the array will go to ((i+k)%n)th index after
        k rotations. (This is when array is rotated K times in the right direction.
        -> with the help of the aux array, we change the elements in this array.
        -> If it is rotated in the left direction K times, then we do (i-k)%n
     */

}
