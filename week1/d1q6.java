public class Solution {
    public int maxProfit(int[] prices) {
        int max=0,n=prices.length,currmin=prices[0];
        int i=1;
        if(n==1)
            return 0;
        else{
            while(i<n){
                if((prices[i]-currmin) < 0)
                    currmin=prices[i];
                else{
                    if((prices[i]-currmin)>max)
                        max=(prices[i]-currmin);
                }
                i++;
            }
        }
        return max;
    }
} d1q6 {
    
}
