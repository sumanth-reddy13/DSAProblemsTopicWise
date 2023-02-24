package org.example;

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
        pattern9(7);
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
                else System.out.print("  ");
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


}
