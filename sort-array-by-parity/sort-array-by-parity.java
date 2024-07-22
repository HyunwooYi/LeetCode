class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int countOdd = 0;
        int toAdd = 0;
        List<Integer> array = new ArrayList<>();

        if (nums.length == 1 )
            return nums;

        int t = 1;
        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 != 0) {
                array.add(nums[i]);
                if (t == n) {
                    break;
                }
                nums[i] = nums[t];
                t++;
            } else {
                nums[countOdd] = nums[i];
                countOdd++;
            }
        }

        for (int j = countOdd; j < n; j++){
            nums[j] = array.get(toAdd);
            toAdd++;
        }
        return nums;
        
    }
}