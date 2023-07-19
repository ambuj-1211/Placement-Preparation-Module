import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mp =new HashMap<>();
        int n= nums.length;
        int arr[]=new int[2];
        for(int i=0;i<n;i++){
            if(mp.containsKey(target-nums[i]))
            {
                arr = new int[]{i,mp.get(target-nums[i])};
                break;
            }
            else{
                mp.put(nums[i],i);
            }
        }
        return arr;
    }
} d4q1 {
    
}
