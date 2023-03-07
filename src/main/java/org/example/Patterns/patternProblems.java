package org.example.Patterns;

import static java.lang.Math.min;

public class patternProblems {
    public static void main(String[] args) {
//        pattern1(5);
//        pattern2(5);
//        pattern3(5);
//        pattern4(5);
//          pattern5(5);
//        pattern6(5);
//        pattern7(5);
//        pattern8(6);
//        pattern9(7);
//        pattern10(5);
//        pattern11(5);
//        pattern12(4);
//        pattern13(6);
//        pattern14(4);
//        pattern15(5);
//        pattern16(5);
//        pattern17(5);
//        pattern18(4);
//        pattern19(5);
//        pattern20(5);
//        pattern21(5);
//        pattern22(5);
//        pattern23(4);
//        pattern24(5);
//        pattern25(5);
        pattern26(5);
    }





    /*                          1         1
                                  2     2
                                    3 3
                                     4
                                    3 3
                                  2     2
                                1         1
    */
    public static void pattern1(int n) {

        for (int i = 1;i <= 2*n-1;i++) {

            int temp = i;
            if (i > n) temp = 2*n-i;
            for (int k = 1;k < temp;k++) {
                System.out.print("  ");
            }
            for (int j = temp;j <= 2*n-temp;j++) {
                if (j == temp || j == 2*n-temp) {
                    System.out.print(temp + "  ");
                }
                else System.out.print("  ]");
            }
            System.out.println();
        }
    }
    /*
                                        *
                                       * *
                                      *   *
                                     *     *
                                    * * * * *
     */
    public static void pattern2(int n) {

        for (int i = 0;i < n;i++) {
            // if (i == n-1), we have to print all 'n' stars. Thus, a separate for loop is written
            if (i == n-1) {
                for (int j = 0;j <= i;j++) {
                    System.out.print("* ");
                }
                continue;
            }
            for (int k = 0;k < n - i-1;k++) {      // This loop is for the spaces.
                System.out.print(" ");
            }

            for (int j = 0;j <= 2*i;j++) {
                if (j == 0 || j == 2*i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    /*
                                     ********1********
                                     *******2*2*******
                                     ******3*3*3******
                                     *****4*4*4*4*****
                                     ****5*5*5*5*5****
     */
    public static void pattern3(int n) {

        for (int i = 1;i <= n; i++) {

            for (int j = i+1;j <= 2*n-1;j++) {
                System.out.print("*");
            }

            for (int j = 1;j <= 2*i-1; j++) {

                if (j % 2 == 0) System.out.print("*");
                else System.out.print(i);
            }

            for (int j = i+1;j <= 2*n-1;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*                      1
                            1 2 1
                            1 2 3 2 1
                            1 2 3 4 3 2 1
                            1 2 3 4 5 4 3 2 1
     */
    public static void pattern4(int n) {

        for (int i = 1;i <= n; i++) {

            for (int j = 1;j <= i;j++) {
                System.out.print(j + " ");
            }

            for (int j = i-1;j>=1;j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    /*
                        A
                        A B A
                        A B C B A
                        A B C D C B A
                        A B C D E D C B A

        This pattern is same as the above pattern 4. In these cases, always print the number pattern and then change the
        code to alphabets. This approach will be a lot easier.
     */

    public static void pattern5(int n) {
        for (int i = 1;i <= n; i++) {

            for (int j = 1;j <= i;j++) {
                System.out.print((char)(j+64) + " ");
            }

            for (int j = i-1;j>=1;j--) {
                System.out.print((char)(j+64) + " ");
            }
            System.out.println();
        }
    }

    /*
                                     *
                                    * *
                                   * * *
                                  * * * *
                                 * * * * *
                                 * * * * *
                                  * * * *
                                   * * *
                                    * *
                                     *
     */
    public static void pattern6(int n) {
        for (int i = 0;i <= 2*n; i++) {
            int temp = i+1;

            if (i > n-1) temp = 2*n-i;

            for (int j = 1;j <= n-temp; j++) {   // to print the spaces upfront.
                System.out.print(" ");
            }

            for (int j = 1;j <= 2*temp-1;j++) {
                if (j % 2!=0) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    /*
                         *
                        * *
                       *   *
                      *     *
                     *       *
                     *       *
                      *     *
                       *   *
                        * *
                         *
     */
    public static void pattern7(int n) {
        int count = 1;
        for (int i = 1;i <= 10; i++) {
            int temp = i;
            if (i > n) {
                temp = i - count;
                count+=2;
            }
            for (int j = 0;j <= n-temp;j++) {
                System.out.print(" ");
            }
            for (int j = 1;j <= 2*temp-1;j++) {
                if (j == 1 || j == 2*temp-1) {
                    System.out.print("*");
                    continue;
                }
                if (j == 0 || j == 2*temp+1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
    /*
            *                    *
             *                  *
              *                *
               *              *
                *            *
      ***********            ***********
                *            *
               *              *
              *                *
             *                  *
            *                    *
     */
    public static void pattern8(int n) {

        for (int i = 1;i < 2*n; i++) {

            if (i == n) {
                print(i);
                continue;
            }

            int temp = i;
            if (temp > n) temp = 2*n - i;
            for (int j = 1;j <= n;j++) System.out.print(" ");
            for (int j = 1;j<temp;j++) System.out.print(" ");
            System.out.print("*");

            for (int j = 1;j < n-temp;j++) System.out.print(" ");
            for (int j = 1;j<=2*n;j++) System.out.print(" ");
            for (int j = 1;j < n-temp;j++) System.out.print(" ");

            System.out.print("*");
            System.out.println();
        }
    }
    public static void print(int n) {
        for (int i = 1;i < 2*n;i++) {
            System.out.print("*");
        }
        for (int j = 1;j<=2*n;j++) System.out.print(" ");
        for (int i = 1;i < 2*n;i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    /*
                                         *******
                                         **   **
                                         * * * *
                                         *  *  *
                                         * * * *
                                         **   **
                                         *******
                           This pattern is for only odd 'n' values.

     */
    public static void pattern9(int n) {

        for (int i = 0;i < n;i++) {
            if (i == 0 || i == n-1) {
                for (int j = 0;j<n;j++) System.out.print("*");
                System.out.println();
                continue;
            }
            if (i == n/2) {
                System.out.print("*");
                for (int j = 1;j < n/2;j++) System.out.print(" ");
                System.out.print("*");
                for (int j = 1;j < n/2;j++) System.out.print(" ");
                System.out.print("*");
                System.out.println();
                continue;
            }
            int temp = i;
            if (temp > n/2) {
                temp = n - 1 - i;
            }

            System.out.print("*");
            for (int j = 1;j<temp;j++) System.out.print(" ");
            System.out.print("*");
            for (int j = 0;j<n-(2*temp)-2;j++) System.out.print(" ");
            System.out.print("*");
            for (int j = 0;j<temp-1;j++) System.out.print(" ");
            System.out.print("*");
            System.out.println();
        }
    }
    /*
                                     * * * * *
                                     * * * * *
                                     * * * * *
                                     * * * * *
                                     * * * * *
     */
    public static void pattern10 (int n) {
        for (int i = 0;i < n;i++) {
            for (int j = 0;j < n;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    /*
                                 *
                                ***
                               *****
                              *******
                             *********
     */
    public static void pattern11(int n) {
        for (int i = 1;i <= n;i++) {

            //spaces
            for (int j = 1;j <= n - i;j++) {
                System.out.print(" ");
            }
            for (int j = 1;j <= 2 * i - 1;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

/*
                        4 4 4 4 4 4 4
                        4 3 3 3 3 3 4
                        4 3 2 2 2 3 4
                        4 3 2 1 2 3 4
                        4 3 2 2 2 3 4
                        4 3 3 3 3 3 4
                        4 4 4 4 4 4 4
 */
    public static void pattern12(int n) {
        int[][] pat = new int[2*n-1][2*n-1];
        int index = 2 * n -2;
        for (int i = 0;i < 2*n-1;i++) {
            for (int j = 0;j < 2*n-1;j++) {
                int num = Math.min(Math.min(i, index - i) , Math.min(j, index-j));
                pat[i][j] = n - num;
            }
        }
        for (int i = 0;i < 2*n-1;i++) {
            for (int j = 0;j < 2*n-1;j++) {
                System.out.print(pat[i][j] + " ");
            }
            System.out.println();
        }
    }
/*
                      0 0 0 0 0 0 0
                      0 1 1 1 1 1 0
                      0 1 2 2 2 1 0
                      0 1 2 3 2 1 0
                      0 1 2 2 2 1 0
                      0 1 1 1 1 1 0
                      0 0 0 0 0 0 0
 */
    public static void pattern13(int n) {
        int[][] pat = new int[2*n-1][2*n-1];
        int index = 2 * n -2;
        for (int i = 0;i < 2*n-1;i++) {
            for (int j = 0;j < 2*n-1;j++) {
                int num = Math.min(Math.min(i, index - i) , Math.min(j, index-j));
                pat[i][j] = num;
            }
        }
        for (int i = 0;i < 2*n-1;i++) {
            for (int j = 0;j < 2*n-1;j++) {
                System.out.print(pat[i][j] + " ");
            }
            System.out.println();
        }
    }
    /*
                                     ****
                                     *  *
                                     *  *
                                     ****
     */
    public static void pattern14(int n) {

        for (int i = 1;i <= n;i++) {
            if (i == 1 || i == n) {
                for (int j = 1;j <=n;j++) {
                    System.out.print("*");
                }
            }
            else {
                for (int j = 1;j <= n;j++) {
                    if (j == 1 || j == n) {
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    /*
                                     *        *
                                     **      **
                                     ***    ***
                                     ****  ****
                                     **********
                                     ****  ****
                                     ***    ***
                                     **      **
                                     *        *
     */
    public static void pattern15(int n) {
//      n = 2 * n;
        for (int i = 1;i < 2*n;i++) {
            int temp = i;
            if (i > n) {
                temp = 2 * n - i;
            }
            int j = 1;
            // front stars
            for (;j <= temp;j++) {
                System.out.print("*");
            }
            // spaces in the middle
            for (;j <= 2 * n - temp;j++) {
                System.out.print(" ");
            }
            //  back stars
            for (;j<=2 * n;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    /*
                                     **********
                                     ****  ****
                                     ***    ***
                                     **      **
                                     *        *
                                     *        *
                                     **      **
                                     ***    ***
                                     ****  ****
                                     **********
     */

    public static void pattern16(int n) {
//        n = 2 * n;

        for (int i = 0;i <= 2*n;i++) {
            if (i == n) continue;
            if (i == 0 || i == 2*n) {
                for (int j = 1;j <= 2*n;j++) {
                    System.out.print("*");
                }
            }
            else {
                int v = i;
                if (i > 5) {
                    v = 2 * n - i;
                }
                int temp = n - (v%5);
                int j = 1;
                for (;j <= temp;j++) {
                    System.out.print("*");
                }
                for (;j <= 2 * n - temp;j++) {
                    System.out.print(" ");
                }
                for (;j<=2 * n;j++) {
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }

    /*
                    E
                    D E
                    C D E
                    B C D E
                    A B C D E
     */
    public static void pattern17(int n){
        for (int i = 1;i <= n;i++) {
            for (int j = n - i;j < n;j++) {
                System.out.print((char)(j + 65) + " ");
            }
            System.out.println();
        }
    }

    /*
                   A
                  ABA
                 ABCBA
                ABCDCBA
     */
    public static void pattern18(int n){
        for (int i = 1;i <= n;i++) {
            for (int j = 1;j <= n - i;j++) {
                System.out.print(" ");
            }
            for (int j = 1;j <= i;j++) {
                System.out.print((char)(j + 64) + "");
            }
            for (int j = i - 1;j >= 1;j--) {
                System.out.print((char)(j + 64) + "");
            }
            System.out.println();
        }
    }

    /*
                        A
                        BB
                        CCC
                        DDDD
                        EEEEE
     */
    public static void pattern19(int n){
        for (int i = 0;i < n;i++) {
            for (int j = 0;j <= i;j++) {
                System.out.print((char) (i + 65));
            }
            System.out.println();
        }
    }
    public static void pattern20(int n){
        for (int i = 0;i < n;i++) {
            for (int j = 0;j < n - i;j++) {
                System.out.print((char) (j + 65));
            }
            System.out.println();
        }
    }

    /*
                            A
                            AB
                            ABC
                            ABCD
                            ABCDE
     */
    public static void pattern21(int n){
        for (int i = 0;i < n;i++) {
            for (int j = 0;j <= i;j++) {
                System.out.print((char) (j + 65));
            }
            System.out.println();
        }
    }

    /*
                    1
                    2 3
                    4 5 6
                    7 8 9 10
                    11 12 13 14 15
     */
    public static void pattern22(int n){
        int num = 1;
        for (int i = 0;i < n;i++) {
            for (int j = 0;j <= i;j++) {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }

    public static void pattern23(int n) {
        for (int i = 1;i <= n;i++) {
            int j = 1;
            for (;j<=i;j++) {
                System.out.print(j);
            }
            for (;j<=2*n-i;j++) {
                System.out.print(" ");
            }
            for (;j<=2*n;j++) {
                System.out.print(2*n-j+1);
            }
            System.out.println();
        }
    }
    public static void pattern24(int n) {
        for (int i = 1;i < 2*n;i++) {
            int temp = i;
            if (i > 5) {
                temp = 2*n - i;
            }
            for (int j = 1;j<=temp;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    /*
                     *
                    ***
                   *****
                  *******
                 *********
                 *********
                  *******
                   *****
                    ***
                     *
     */
    public static void pattern25(int n) {
        int v = 1;
        for (int i = 1;i <= 2*n;i++) {
            int temp = i;
            if (i > 5) {
                temp = i - v;
                v+=2;
            }
            for (int j = 1;j<=n - temp;j++) {
                System.out.print(" ");
            }
            for (int j = 1;j<=2*temp-1;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    /*
                     *********
                      *******
                       *****
                        ***
                         *
     */
    public static void pattern26(int n) {
        for (int i = 1;i <= n;i++) {
            for (int j = 1;j<i;j++) {
                System.out.print(" ");
            }
            for (int j = 1;j<=2*(n-i)+1;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
