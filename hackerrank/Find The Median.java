public static int findMedian(List<Integer> arr) {
    arr.sort(null);
    return arr.get(arr.size()/2);
}