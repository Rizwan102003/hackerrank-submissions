public static String caesarCipher(String s, int k) {
    String ans="";
    k=k%26;
    int n=s.length();
    int i=0;
    while(i<n){
        char c=s.charAt(i);
        if (Character.isUpperCase(c))
            c = (char) ((c - 'A' + k) % 26 + 'A');
        if (Character.isLowerCase(c))
            c = (char) ((c - 'a' + k) % 26 + 'a'); 
        ans+=c;
        i++;
    }
    return ans;
}