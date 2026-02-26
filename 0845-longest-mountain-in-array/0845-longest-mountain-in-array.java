class Solution {
    public int longestMountain(int[] arr) {
        int n = arr.length;
        if (n < 3) return 0;

        int[] up = new int[n];
        int[] down = new int[n];

        // build increasing slopes
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                up[i] = up[i - 1] + 1;
            }
        }

        // build decreasing slopes
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > arr[i + 1]) {
                down[i] = down[i + 1] + 1;
            }
        }

        int longest = 0;

        // check valid peaks
        for (int i = 0; i < n; i++) {
            if (up[i] > 0 && down[i] > 0) {
                longest = Math.max(longest, up[i] + down[i] + 1);
            }
        }

        return longest;
    }
}