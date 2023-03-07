package org.example.SortingTechniques;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {5,7,9,5,4,1};
        quickSort(arr, 0, arr.length - 1);
        System.out.print(Arrays.toString(arr));
    }
    /*
    ,Quick Sort Notes: We can choose pivot b/w the middle element or corner elements.
            But, if you choose corner elements and every time you get the pivot as shortest or the largest, it will take
            O(N^2) Time Complexity (worst case).
            Best Case Time Complexity : O(Nlog(N))
     */
    public static void quickSort(int[] nums, int s, int e) {
        if (s < e) {
            int parInd = partitionIndex(nums, s, e);
            quickSort(nums, s,parInd-1);
            quickSort(nums, parInd + 1, e);
        }
    }
    public static int partitionIndex(int[] nums, int s, int e) {
        int par = s;

        while (s < e) {
            while (s <= e && nums[s] <= nums[par]) {
                s++;
            }
            while (e >= 0 && nums[e] > nums[par]) {
                e--;
            }
            if (s < e) {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
            }
        }
        int temp = nums[e];
        nums[e] = nums[par];
        nums[par] = temp;
        return e;
    }

    /* Merge Sort
            -> For linked List, Merge Sort is preferred because unlike array, linked list is not contiguous memory allocation.
            -> Merge Sort is inplace sorting Algorithm.
            -> For Merge Sort, An extra space of O(N) is required.
     */
}
