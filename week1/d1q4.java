public class Solution {
    public int maxSubArray(int[] nums) {
        int max= Integer.MIN_VALUE;
        int n=nums.length;
        int s=0,sumprev;
        for(int i=0;i<n;i++){
            s=s+nums[i] ;
            if(s>max){
                max=s;
            }
            if(s<0){
                s=0;
            }
            sumprev=s;
        }
        return max;
    }
} d1q4 {
    
}
