package org.example.Maths;

public class BasicMaths {
    public static void main(String[] args) {
        isPrime(100);
    }


//   Problem- 1 -> Count Digits     https://practice.geeksforgeeks.org/problems/count-digits5716/1

        // what to learn from this problem is, when you are dividing the operations for each iteration , then the time complexity
        //  will be log(N).

    public static int evenlyDivides(int N){
        int count = 0;
        int num = N;

        while (num != 0) {
            int rem = num % 10;
            if (rem != 0)
                if (N % rem == 0) count++;
            num/=10;
        }
        return count;
    }

//    Problem-2  -> Reverse Bits   https://practice.geeksforgeeks.org/problems/reverse-bits3556/1
//    what I learnt is, when you come across a problem which at the first look feels like you don't know the answer,
//    Stay calm and see what the question is asking you to do.
//    I thought in a step by step way about how to approach the solution, At last I got the solution.

    // Approach: get the LSB of the X for every iteration.
    //      As we are reversing the bits.  LSB should move to MSB. bit in 0th place should move to 31st place. 1st-30th place.
//
    public static Long reversedBits(Long X) {
        long ans = 0;
        int n = 31;

        while (X != 0) {
            long t = X&1;
            ans = ans|(t<<n);
            X = X>>1;           // X right shift by 1 every iteration.
            n--;                // Dry run if forgot the logic. Ex : 000_000_0101  -> 1010_000_000
        }
        return ans;
    }
    // Time Complexity : log(N) as we are dividing by 2 each iteration.


    // Problem-3  -> Check if the number is Palindrome.
    public static String is_palindrome(int n)
    {
        // At first, reverse the given number. If the original number and the reversed number is same, they are
        // palindrome
        // Time complexity: O(log(N))

        int original = n;
        int reverse = 0;

        while (n != 0) {
            int rem = n % 10;
            reverse = reverse * 10 + rem;
            n /= 10;
        }
        return original == reverse ? "Yes" : "No";

        // Another Approach: I converted the given number to a string by adding a empty string.
        // If a number is palindrome, then first half of the digit should be equal to reverse of second half.

        // String s = "" + n;

        // int i = 0;
        // int j = s.length() - 1;

        // while (i < j) {
        //     if (s.charAt(i) == s.charAt(j)) {
        //         i++;
        //         j--;
        //     }
        //     else return "No";
        // }
        // return "Yes";
    }

    // Problem-4 Armstrong Numbers -> A number is an armstrong number if the sum of cubes of its digit is equal to the number
    //  itself.
//    https://practice.geeksforgeeks.org/problems/armstrong-numbers2727/1

    // Problem-5 Print All Divisors

    // Go up to the square root of the number, if 'i' is a divisor of number 'N'. Then N / i is also a divisor of N.

    // Problem-6  print all prime numbers b/w 1 - 100;

    public static void isPrime(int n) {

        // This is sieve of Eratosthenes method.

        boolean[] visited = new boolean[n+1];
        visited[0] = true;
        visited[1] = true;

        for (int i = 2;i*i <= n;i++) {         // Outer loop runs square root of n times.
            if (!visited[i]) {
                for (int j = i*i;j <= n;j+=i) {   // Inner loop runs < n times approximately. TC would be O(n * root(n))
                    visited[j] = true;
                }
            }
        }
        for (int i = 0;i <visited.length;i++) {
            if (!visited[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
