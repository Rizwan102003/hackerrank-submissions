import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            long n = in.nextLong();
            System.out.println(getEvenFibonacciSum(n));
        }
    }
    public static long getEvenFibonacciSum(long n) {
        long a = 1, b = 2;
        long sum = 0;
        while (b <= n) {
            if (b % 2 == 0) sum += b;
            long next = a + b;
            a = b;
            b = next;
        }
        return sum;
    }
}