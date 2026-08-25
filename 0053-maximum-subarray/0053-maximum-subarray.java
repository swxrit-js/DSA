class Solution {
    public int maxSubArray(int[] arr) {
        int curr_sum = 0;
        int maxi = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            curr_sum += arr[i];
            maxi =Math.max(curr_sum,maxi);
            
            if(curr_sum < 0)
            {
                curr_sum = 0;
            }
            
        }
        return maxi;
    }
}