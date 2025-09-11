class Result {
    /*
     * Complete the 'palindromeIndex' function below.
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */
    public static int palindromeIndex(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                if (isPalindrome(s, left + 1, right)) return left;
                if (isPalindrome(s, left, right - 1)) return right;
            }
            left++;
            right--;
        }
        return -1;
    }
    private static boolean isPalindrome(String s, int left, int right) {
        while (left < right)
            if (s.charAt(left++) != s.charAt(right--)) return false;
        return true;
    }
}