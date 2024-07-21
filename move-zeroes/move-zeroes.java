class Solution {
    public int[] moveZeroes(int[] nums) {

        int n = nums.length;
        int k = 0;

        for (int j = 0; j < n; j++) {
            if (nums[j] != 0) {
                nums[k] = nums[j];
                k++;
            }
        }

        for (int t = k; t < n; t++)
            nums[t] = 0;

        return nums;
    }
}