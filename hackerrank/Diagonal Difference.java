public static int diagonalDifference(List<List<Integer>> arr) {
    int n = arr.size();
    int ld = 0,rd=0;
    for (int i = 0; i < n; i++) {
        ld += arr.get(i).get(i);
        rd += arr.get(i).get(n - i - 1); 
    }
    return Math.abs(ld - rd);
}
/* O(n) approach
int ld=0,rd=0;
int rows=arr.length;
int cols=arr[0].length;
int i=0,j=0,k=0,l=arr.length-1;
while(i<rows && j<cols && k<rows && i>=0 && l>=0){
    ld+=arr[i][j];
    rd+=arr[k][l];
    i++;
    j++;
    k++;
    l--;
}
*/