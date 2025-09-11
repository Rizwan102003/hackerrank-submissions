public static List<Integer> breakingRecords(List<Integer> scores) {
    ArrayList<Integer> ans=new ArrayList<>();
    ans.add(0,0);
    ans.add(1,0);
    int n=scores.size();
    int max=scores.get(0),min=scores.get(0);
    for(int i=1;i<n;i++){
        if(scores.get(i)>max){
            max=scores.get(i);
            ans.set(0,ans.get(0)+1);
        }
        if(scores.get(i)<min){
            min=scores.get(i);
            ans.set(1,ans.get(1)+1);
        }
    }
    return ans;
}