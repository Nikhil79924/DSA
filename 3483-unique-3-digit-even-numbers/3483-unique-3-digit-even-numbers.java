class Solution {
    public int totalNumbers(int[] digits) {
        int count = 0;

        for (int i = 1; i <= 9; i++) {          // First digit
            for (int j = 0; j <= 9; j++) {      // Second digit
                for (int k = 0; k <= 8; k += 2) { // Last digit
                    if (canMake(digits, i, j, k)) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    public boolean canMake(int[] digits, int a, int b, int c) {
        int[] freq = new int[10];

        for (int d : digits) {
            freq[d]++;
        }

        freq[a]--;
        freq[b]--;
        freq[c]--;

        return freq[a] >= 0 && freq[b] >= 0 && freq[c] >= 0;
    }
}