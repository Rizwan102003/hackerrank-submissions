class Result {
    /*
     * Complete the 'countResponseTimeRegressions' function below.
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY responseTimes as parameter.
     */
    public static int countResponseTimeRegressions(List<Integer> responseTimes) {
        int n=responseTimes.size();
        if (n==0 || n==1) return 0;
        long sum = responseTimes.get(0);
        int count = 1,result = 0;
        for (int i = 1; i < n; i++) {
            double avg = (double) sum / count;
            if (responseTimes.get(i) > avg)
                result++;
            sum += responseTimes.get(i);
            count++;
        }
        return result;
    }
}
/*
for [100,200,300]

the average is (100)/1=100
the average is (100+200)/2=150
the average is (100+200+300)/3=200

but rolling avg with (avg+responseTimes.get(i))/2 gives:
the average is (100)/1=100
the average is (100+200)/2=150
the average is (150+300)/2=225

so don't use rolling average
*/