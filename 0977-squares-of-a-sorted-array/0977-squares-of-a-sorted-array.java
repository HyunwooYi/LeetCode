class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            result[i] = nums[i]*nums[i];
        }
        
        int small =0;
        for(int k = result.length; k>0; k--){
            for(int j = 0; j<= k-2; j++){
                if(result[j] > result[k-1]){
                    small = result[k-1];
                    result[k-1] = result[j];
                    result[j] = small;
                }
            }
        }
        
        return result;
    }
}