class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
                
            }else{map.put(nums[i],1);}
            
        }
        int ans1=-1;
        int ans=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]%2==0){
                if(map.get(nums[i])>ans){
                    ans1=nums[i];
                    ans=map.get(nums[i]);
                }else if (map.get(nums[i])==ans){
                    ans1= Math.min(ans1,nums[i]);
                }
            }
            
        }return ans1;
    }
}

        

