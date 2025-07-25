class Result {
    /*
     * Complete the 'superDigit' function below.
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING n
     *  2. INTEGER k
     */
    public static int superDigit(String n, int k) {
        /*
        superDigit(p) = superDigit(n repeated k times)
              = superDigit(9875987598759875)
              = superDigit(4 * (sum of digits of n))
              = superDigit(4 * (9+8+7+5)) = superDigit(4 * 29) = superDigit(116)
        */
        long sum = 0;
        for (char c : n.toCharArray())
            sum += c - '0';
        sum *= k;
        return superDigitHelper(sum);
    }
    private static int superDigitHelper(long n) {
        if (n < 10) return (int) n;
        long next = 0;
        while (n > 0) {
            next += n % 10;
            n /= 10;
        }
        return superDigitHelper(next);
    }
}
/*
In Java:
Characters like '0', '1', ..., '9' are stored using their ASCII values.
'0' has an ASCII value of 48
'1' is 49, '2' is 50, ..., '9' is 57

Suppose:
char c = '9'; 
Then:
c - '0' = 57 - 48 = 9
This gives you the numeric value of the digit character.

So for any digit character 'c', doing c - '0' converts it from a character like '7' to the number 7.
This expression returns an int.

so,get initial sum in long and send to helper
 */