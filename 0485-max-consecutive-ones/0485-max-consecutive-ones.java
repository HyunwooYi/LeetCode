class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int input = 0;
        int result = 0;
        
        for (int i=0; i<nums.length; i++){
            if (nums[i] == 1)
                input++;
            else{
                if (input>result){
                    result= input;
                }
                input = 0;

            
            }
        }
        if (input> result)
            return input;
        else 
            return result;
    }
}