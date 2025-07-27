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
            largestPalin(n);
        }
    }
    public static void largestPalin(int n){
        for(int i=n-1;i>10000;i--){
            if(isPalindrome(i)&&isFactor(i)){
                System.out.println(i);
                break;
            }
        }
    }
    public static boolean isPalindrome(int num) {
        int rev = 0, original = num;
        while(num > 0){
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev == original;
    }
    public static boolean isFactor(int num) {
        for (int i = 999; i >= 100; i--) {
            if (num % i == 0) {
                int quotient = num / i;
                if (quotient >= 100 && quotient <= 999) return true;
            }
        }
        return false;
    }
}