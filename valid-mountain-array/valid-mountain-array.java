import java.util.Arrays;

class Solution {

    public boolean validMountainArray(int[] arr) {
        
        if (arr.length < 3) {
            return false;
        }

        int max = Arrays.stream(arr).max().getAsInt();

        // if "last index value is max" or "0th index value is max" -> return false
        if (arr[arr.length - 1] == max || arr[0] == max) {
            return false;
        }

        // if "0th index value is bigger than 1th index value" -> return false
        if (arr[0] > arr[1]) {
            return false;
        }
        
        int k = 2;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[k]) {

            } else {
                for (int s = i; s < arr.length; s++) {
                    if (arr[s] > arr[s + 1]) {
                        if (s + 1 == arr.length - 1) {
                            return true;
                        }
                    } else
                        return false;
                }
            }
            k++;
        }
        return true;
    }
}