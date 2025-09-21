class Result {
    /*
     * Complete the 'compareTriplets' function below.
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int alice = 0, bob = 0;
        for (int i = 0; i < 3; i++) {
            if (a.get(i) > b.get(i))
                alice++;
            else if (a.get(i) < b.get(i))
                bob++;
        }
        return Arrays.asList(alice, bob);
    }
}
/*
Arrays.asList(T... a) is a utility method in Java.
It takes a variable number of arguments (varargs) and wraps them into a fixed-size list backed by the given array.
*/