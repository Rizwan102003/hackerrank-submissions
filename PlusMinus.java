public static void plusMinus(List<Integer> arr) {
    int l=arr.size();
    int p=0,n=0,z=0;
    for(int i:arr){
        if(i>0) p++;
        if(i<0) n++;
        if(i==0) z++;
    }
    System.out.printf("%.6f\n", (double) p/l);
    System.out.printf("%.6f\n", (double) n/l);
    System.out.printf("%.6f\n", (double) z/l);
}