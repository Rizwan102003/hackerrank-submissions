public static void minimumBribes(List<Integer> q) {
    int n=q.size();
    int bribes = 0,p1=1,p2=2,p3=3;
    for (int i = 0; i < q.size(); i++) {
        int current = q.get(i);
        if(current==p1){
            p1=p2;
            p2=p3;
            p3++;
        }
        else if(current==p2){
            bribes++;
            p2=p3;
            p3++;
        }
        else if(current==p3){
            bribes+=2;
            p3++;
        }
        else {
            System.out.println("Too chaotic");
            return;
        }
    }
    System.out.println(bribes);
}
/*
explanation video: https://www.youtube.com/watch?v=LgszjFykAbE
In this implementation:
- We track the positions of the three people with p1, p2, and p3.
- We count the number of bribes by checking how many times each person has moved forward.
- If a person is found in a position that is too far ahead of their original position, we print "Too chaotic".
*/