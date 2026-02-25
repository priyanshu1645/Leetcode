class Solution {

    public void nextPermutation(int[] nums) {
        int index = -1;
        int n = nums.length;

        // 1. find first decreasing element from right
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }

        // 2. if no pivot found → reverse whole array
        if (index == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        // 3. find just larger element and swap
        for (int i = n - 1; i > index; i--) {
            if (nums[i] > nums[index]) {   // ✅ FIXED SIGN
                swap(nums, i, index);
                break;
            }
        }

        // 4. reverse suffix
        reverse(nums, index + 1, n - 1);
    }

    // reverse method
    private void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    // swap method
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}