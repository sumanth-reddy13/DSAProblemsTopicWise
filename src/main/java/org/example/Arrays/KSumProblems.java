package org.example.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KSumProblems {
    public static void main(String[] args) {
/*        LC Problems -> 2Sum, 2Sum-II, 3Sum, 4Sum,
          4SumII has O(N^4), O(N^3), O(N^2) Approaches.
*/
    }

    int len = 0;
public List<List<Integer>> fourSum(int[] nums, int target) {  // KSum Problem.
    len = nums.length;
    Arrays.sort(nums);
    return kSum(nums, target, 4, 0);

}

/*
      4 Sum Problem -> Have 3 Nested Loops and for the last one, do binary Search.

 */
    public List<List<Integer>> kSum(int[] nums, long target, int k, int index) {
        List<List<Integer>> res = new ArrayList<>();
        if (index >= len) return res;

        if (k == 2) {
            int i = index;
            int j = len - 1;
            while (i < j) {
                if (target - nums[i] > nums[j]) i++;
                else if (target - nums[i] < nums[j]) j--;
                else {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[j]);
                    list.add((int)(target - nums[j]));
                    res.add(list);
                    while (i < j && nums[i] == nums[i+1]) i++;
                    while (i < j && nums[j] == nums[j-1]) j--;
                    i++;
                    j--;
                }
            }
        }
        else {
            for (int i = index;i < len-k+1;i++) {
                List<List<Integer>> temp = kSum(nums, (long)(target - nums[i]) , k - 1, i + 1);
                if (temp != null) {
                    for (List<Integer> t : temp) {
                        t.add(0, nums[i]);
                    }
                    res.addAll(temp);
                }
                while (i < len-1 && nums[i] == nums[i+1]) i++;
            }
        }
        return res;
    }
}
