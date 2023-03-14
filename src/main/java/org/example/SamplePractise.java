package org.example;

import java.util.Arrays;
import java.util.Comparator;

public class SamplePractise {
    public static void main(String[] args) {
        int[] nums = {-3,-2,-1,4,3,2,1};
        Integer[] nu = new Integer[nums.length]; int k = 0;
        for (int num : nums) {
            nu[k++] = num;
        }

        Arrays.sort(nu, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

            }
        });

        k = 0;
        for (int num : nu) {
            nums[k++] = num;
        }

        System.out.print(Arrays.toString(nums));
    }
}
