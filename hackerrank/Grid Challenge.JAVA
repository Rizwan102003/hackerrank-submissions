public static String gridChallenge(List<String> grid) {
    int n = grid.size();
    for (int i = 0; i < n; i++) {
        char[] row = grid.get(i).toCharArray();
        Arrays.sort(row);
        grid.set(i, new String(row));
    }
    for (int col = 0; col < grid.get(0).length(); col++) {
        for (int row = 0; row < n - 1; row++) {
            if (grid.get(row).charAt(col) > grid.get(row + 1).charAt(col)) {
                return "NO";
            }
        }
    } 
    return "YES";
}