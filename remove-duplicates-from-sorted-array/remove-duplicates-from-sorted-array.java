class Solution {
    public static int removeDuplicates(int[] nums) {
        int index = 0;
        int i;
        int now = 0;
        int saveNum =0;
        
        for (i = 0; i < nums.length; i++) {
            if (i == 0) {
                now = nums[i];
            }
            else {
                if (now == nums[i]) {
                    index = i;
                } else {
                    nums[++saveNum] = nums[i];
                    now = nums[i];
                    index = i;
                }
            }

        }

        return saveNum+1;
    }

}
