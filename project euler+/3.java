import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            largestPrime(n);
        }
    }
    public static void largestPrime(long n){
        long maxPrime = -1;
        while (n % 2 == 0) {
            maxPrime = 2;
            n /= 2;
        }
/*      Every time n is divisible by 2, we:
            Update maxPrime = 2
            Divide n by 2
        Effect: This ensures that n becomes odd (so we can skip all even numbers in the next step).
*/
        for (long i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                maxPrime = i;
                n /= i;
            }
        }
/*      Loop starts from 3 and increments by 2 (checking only odd numbers).
        Condition i * i <= n:
        You only need to go up to √n because if n has a factor larger than √n, then it must be paired with a smaller factor (which would’ve been found earlier).

        Inside the loop:
        While n is divisible by i, divide it and update maxPrime.
        This ensures all prime factors of n are removed step-by-step, and the last one found (biggest one) gets stored.
*/
        if (n > 2) maxPrime = n;
        System.out.println(maxPrime);
/*      After the loop:
        If n is still > 2, then n itself is a prime number greater than √original n, and thus it is the largest prime factor.
*/
    }
}
/*
Example:
For n = 29, the loops won't divide it at all.
But n is prime, so maxPrime = 29.
*/