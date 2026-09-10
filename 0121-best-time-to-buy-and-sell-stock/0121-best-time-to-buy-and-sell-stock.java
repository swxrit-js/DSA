class Solution {
    public int maxProfit(int[] nums) {
        int minPrice=nums[0];
        int maxProfit=0;
        for(int i=0;i<nums.length;i++)
        {
            int profit=nums[i]-minPrice;
            if(maxProfit<profit)
            {
                maxProfit=profit;
            }
            if(nums[i]<minPrice)
            {
                minPrice=nums[i];
            }

        }
        return maxProfit;
    }
}