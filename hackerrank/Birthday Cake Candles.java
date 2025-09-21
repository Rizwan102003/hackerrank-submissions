class Result {
    /*
     * Complete the 'birthdayCakeCandles' function below.
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */
    public static int birthdayCakeCandles(List<Integer> candles) {
        int count = 0,max=0;
        for (int c : candles) {
            if (c>max) {
                max=c;
                count=1;
            }
            else if(c==max) count++;
        }
        return count;
    }
}