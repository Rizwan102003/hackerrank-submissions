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
kind of a 3-pointer approach
explanation video: https://www.youtube.com/watch?v=LgszjFykAbE
In this implementation:
- We track the positions of the three people with p1, p2, and p3.
- We count the number of bribes by checking how many times each person has moved forward.
- If a person is found in a position that is too far ahead of their original position, we print "Too chaotic".

Dry Run: 1 2 4 3 7 6 5
Let's walk through each iteration step by step.

 i = 0 → current = 1
Matches p1=1
p1 = p2 = 2, p2 = p3 = 3, p3 = 4

 i = 1 → current = 2
Matches p1=2
p1 = p2 = 3, p2 = p3 = 4, p3 = 5

 i = 2 → current = 4
Matches p2=4
bribes = 1

p2 = p3 = 5, p3 = 6
 i = 3 → current = 3
p1 = 3
p2 = 5
p3 = 6
So current = 3 matches p1=3 
Set p1 = p2 = 5, p2 = p3 = 6, p3 = 7

 i = 4 → current = 7
Matches p3=7
bribes += 2 → bribes = 3
p3 = 8

 i = 5 → current = 6
Matches p2=6
bribes++ → bribes = 4
p2 = p3 = 8, p3 = 9

 i = 6 → current = 5
Matches p1=5
p1 = p2 = 8, p2 = p3 = 9, p3 = 10
*/