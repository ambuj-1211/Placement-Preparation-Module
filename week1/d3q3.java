public class Solution {
    public int majorityElement(int[] nums) {
        //
        int candi = -1;
        int count =0;
        for(int i=0;i<nums.length;i++){
            if(count == 0){
                candi = nums[i];
                count =1;
            }
            else{
                if(nums[i] == candi)
                count ++;
                else
                count --;
            }
        }
        return candi;
    }
} d3q3 {
    
}
