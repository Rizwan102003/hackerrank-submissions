public static List<Integer> countingSort(List<Integer> arr) {
    ArrayList<Integer> ans=new ArrayList<>();
    int n=arr.size();
    for(int i=0;i<100;i++)
        ans.add(0);
    for(int i=0;i<n;i++)
        ans.set(arr.get(i), ans.get(arr.get(i)) + 1);
    return ans;
    // not -> ans.set(arr.get(i), ans.get(i) + 1); , this is because i is running loop from 0. we need to ++ at the index or arr[i]....
}