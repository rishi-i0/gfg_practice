
import java.util.*;
class Solution {
    boolean twoSum(int arr[], int target) {
        int n=arr.length;
        // code here
         Arrays.sort(arr);
        int left = 0;
        int right = n - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return true;
            } else if (sum < target) left++;
            else right--;
        }
        return false;
    }
        
    
}