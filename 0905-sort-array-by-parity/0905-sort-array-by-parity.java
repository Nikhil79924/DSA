class Solution {
    public int[] sortArrayByParity(int[] nums) {
        // for (int i=0;i<nums.length;i++){
        //     for(int j=i;j<nums.length;j++){
        //         if(nums[j]%2==0){
        //             int tamp =nums[j];
        //             nums[j]=nums[i];
        //             nums[i]=tamp;
        //             break;
        //         }
        //     }
        // }return nums;
        int a=0;
        int b=nums.length-1;
        while(a<b){
            if(nums[b]%2==0){
                int tamp =nums[b];
                nums[b]=nums[a];
                nums[a]=tamp;
                a++;
            }else{
                b--;
            }
        }return nums;
    }
}

        

