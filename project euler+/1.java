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
            int n = in.nextInt();
            divisible(n);
        }
    }
    public static void divisible(int n){
        long sum = sumDivisibleBy(n, 3) + sumDivisibleBy(n, 5) - sumDivisibleBy(n, 15);
        System.out.println(sum);
    }
    static long sumDivisibleBy(int n, int x) {
        long p = (n - 1) / x;
        return x*p*(p+1)/ 2;
    }
}
/*
We do (n - 1) / x to ensure we exclude n itself (even if it’s a multiple of x), because the problem wants multiples strictly less than n.
p finds number of multiples, eg (10-1)/3=3 --> 3,6,9 

Let:
x be the number we want multiples of
n be the upper limit (exclusive)

So there are p multiples:
x, 2x, 3x, ..., px

p=[n-1]/x

Now, we want the sum:
x +2x +3x +... +px=x(1+2+3+...+p)=x * (p(p+1)/2)

O(1) time complexity
*/