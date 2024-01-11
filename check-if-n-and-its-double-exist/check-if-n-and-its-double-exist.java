class Solution {
    public boolean checkIfExist(int[] arr) {
        boolean x = true;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if (i == j){
                    continue;
                }
                if (arr[i] == (2*arr[j])){
                    x = true;
                    break;
                } else{
                    x = false;
                }
            }
            if (x){
                break;
            }
        }

        if (x) {
            return true;
        }
        else {
            return false;
        }
    }
}