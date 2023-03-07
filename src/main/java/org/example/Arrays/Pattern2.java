package org.example.Arrays;

public class Pattern2 {
    public static void main(String[] args) {

    }

    /*
          Problem-1
          -> Remove Duplicates from sorted array.
          -> https://leetcode.com/problems/remove-duplicates-from-sorted-array/
     */
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 1) return 1;
        int index = 0;
        int flag = 0;
        for (int i = 0;i < n-1;i++) {
            if (nums[i] == nums[i+1]) {
                nums[i] = -101;
                if (flag == 0) {
                    flag = 1;
                    index = i;
                }
            }
        }
        // int j = 0;
        for (int i = 0;i < n;i++) {
            if (nums[i] != -101 && i >= index) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    /*
           Problem-2
           -> Move zeroes to end
           -> https://leetcode.com/problems/move-zeroes/
     */
    public static void moveZerosToEnd(int[] arr) {

        // Approach 1
        int zeros = 0;
        int n = arr.length;

        for (int i = 0;i < n;i++) {
            if (arr[i] == 0) {
                zeros++;
            }
            else if (zeros > 0) {
                arr[i - zeros] = arr[i];
                arr[i] = 0;
            }
        }

        // Approach 2
        /*
                    int index = Integer.MAX_VALUE;

                    int flag = 0;
                    for (int i = 0;i < n;i++) {
                        if (nums[i] != 0 && i > index) {
                            nums[index] = nums[i];
                            index++;
                        }
                        else if (nums[i] == 0 && flag == 0){
                            index = i;
                            flag = 1;
                        }
                    }

                    if (index == Integer.MAX_VALUE) return;
                    while (index < n) {
                        nums[index++] = 0;
                    }
         */
    }

    /*
                    rs.stream().mapToInt(i -> i).toArray()
            -> rs is an ArrayList. In order to convert the arrayList to an Array, we have to do the following.
            -> stream() is a function of ArrayList class that converts the values in arraylist to Integer objects.
            -> mapToInt maps the Integer objects to its corresponding int values.
            -> toArray() prints the values in the form of an array.
     */
}
