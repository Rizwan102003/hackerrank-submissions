public static void miniMaxSum(List<Integer> arr) {
    long a=arr.get(0);
    long b=arr.get(1);
    long c=arr.get(2);
    long d=arr.get(3);
    long e=arr.get(4);
    long max=Math.max(a, b);
    max=Math.max(max, c);
    max=Math.max(max, d);
    max=Math.max(max, e);
    long min=Math.min(a, b);
    min=Math.min(min,c);
    min=Math.min(min,d);
    min=Math.min(min,e);
    long tot=a+b+c+d+e;
    System.out.print(tot-max+" ");
    System.out.print(tot-min);
}