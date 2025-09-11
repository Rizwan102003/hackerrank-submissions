public static String timeConversion(String s) {
    char f=s.charAt(8);
    int temp = Integer.parseInt(s.substring(0,2));
    String str1;
    if(f=='P'){ 
        if(temp!=12) temp+=12;
        str1 = Integer.toString(temp);
    }
    else {
        if(temp==12) str1="00";
        else str1=s.substring(0,2);
    }
    String ans=str1+s.substring(2,8);
    return ans;
}