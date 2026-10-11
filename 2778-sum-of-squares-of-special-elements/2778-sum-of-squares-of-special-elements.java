class Solution {
    public int sumOfSquares(int[] nums) {
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            int val=nums.length% (i+1);

            if (val == 0){
                sum =sum+ nums[i]*nums[i];

            }
        }
        return sum;
    }
}