class Solution {
    public void duplicateZeros(int[] arr) {
        String temp = "";
        for (int N : arr){
            if (N == 0)
                temp = temp + N + N;
            else
                temp += N;
        }
        
        for(int j = 0; j < arr.length; j++)
            arr[j] = Character.getNumericValue(temp.charAt(j));
        
    }
}