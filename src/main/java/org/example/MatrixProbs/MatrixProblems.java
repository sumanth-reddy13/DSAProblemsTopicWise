package org.example.MatrixProbs;

public class MatrixProblems {
    public static void main(String[] args) {

    }

    /*   Problem-1: Given an n*m matrix where each row is sorted. Each row contains only 0's and 1's.
                    Find the row with maximum number of 1's.

         -> BruteForce Approach: Traverse the matrix and check for each row. TC - O(n * m)

         -> Efficient Approach: For every row, do binary Search and find the first occurrence of 1 in that row. This takes O(NLogM)

         -> Optimized Approach:
                                for (int[] a : arr) {
                                    Arrays.sort(a);
                                }

                                int index = m - 1;
                                int row = -1;

                                for (int i = 0;i < n;i++) {
                                    for (int j = index;j >= 0;j--) {
                                        if (arr[i][j] == 1) {
                                            index--;
                                            row = i;
                                        }
                                        else{
                                            break;
                                        }
                                    }
                                }
                                return row;
     */
}
