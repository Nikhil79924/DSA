class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Set<Integer> set = new HashSet<>();

        // First k+1 elements
        for (int i = 0; i <= Math.min(k, nums.length - 1); i++) {

            if (set.contains(nums[i])) {
                return true;
            }

            set.add(nums[i]);
        }

        // Remaining elements
        for (int i = k + 1; i < nums.length; i++) {

            set.remove(nums[i - k - 1]);

            if (set.contains(nums[i])) {
                return true;
            }

            set.add(nums[i]);
        }

        return false;
    }
}

        

