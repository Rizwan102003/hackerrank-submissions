public static int diagonalDifference(List<List<Integer>> arr) {
    int n = arr.size();
    int ld = 0,rd=0;
    for (int i = 0; i < n; i++) {
        ld += arr.get(i).get(i);
        rd += arr.get(i).get(n - i - 1); 
    }
    return Math.abs(ld - rd);
}