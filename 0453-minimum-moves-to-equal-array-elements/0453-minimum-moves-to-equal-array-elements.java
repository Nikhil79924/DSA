class Solution {
    public int minMoves(int[] nums) {
        int lot = Arrays.stream(nums).min().getAsInt(), moves = 0;
        for (int x : nums) moves += x - lot;
        return moves;
    }
}

        

