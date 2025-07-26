public static List<Integer> gradingStudents(List<Integer> grades) {
    int n=grades.size();
    for(int i=0;i<n;i++){
        int curr=grades.get(i);
        if(curr>37){
            int nextMult = ((curr / 5) + 1) * 5;
            if (nextMult - curr < 3)
                curr=nextMult;
        }
        grades.set(i, curr);
    }
    return grades;
}