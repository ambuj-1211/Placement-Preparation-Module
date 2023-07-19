import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public // import java.util.*;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        // Map<Integer,Integer> mp = new HashMap<>();
        // for(int i:nums){
        //     mp.put(i,mp.getOrDefault(i,0)+1);

        // }
        // for(int i:mp.keySet()){
        //     if(mp.get(i)>(nums.length/3))
        //     ans.add(i);
        // }
        // return ans;
        Arrays.sort(nums);
        int max = 1;
        for(int i =1;i<nums.length; i++){
            if(nums[i]==nums[i-1]){
                max++;
            }
            else{
                if(max>nums.length/3)
                ans.add(nums[i-1]);
                max=1;
            }
        }
        if(max>nums.length/3){
            ans.add(nums[nums.length-1]);
        }
        return ans;
    }
} d3q4 {
    
}
