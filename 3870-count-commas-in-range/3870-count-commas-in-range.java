class Solution {
    public int countCommas(int n) {
        int num=0;
        if (n>=999){
            for (int i=0;i<n-999;i++){
                num =num+1;

            }

        }return num;


    }
}