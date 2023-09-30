class Solution {
    public int findNumbers(int[] nums) {
        int even = 0;
        for (int number : nums){
            int i = 0;
            for(i =0; number >0; i++){
                number = (number / 10);
                
            }
            if ( i % 2 == 0)
                even++;
        }
        return even;
    }
}