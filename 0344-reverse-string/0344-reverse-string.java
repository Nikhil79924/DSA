class Solution {
    public void reverseString(char[] s) {
        int n =s.length;
        int a =s[0];
        int b =s[n-1];
        int k = n/2;
        for(int i=0;i<k;i++){
            char tamp=s[i];
            s[i]=s[n-i-1];
            s[n-i-1]=tamp;
        }



    }
}