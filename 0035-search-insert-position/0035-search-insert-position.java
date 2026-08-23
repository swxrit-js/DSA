class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int left=0,right=n-1;

        while(left<=right)
        {
            int mid=left+(right-left)/2;

            if(nums[mid]==target) return mid;
            else if(nums[mid]>target) right=mid-1;
            else left=mid+1;
        }
        for(int i=0;i<n;i++)
        {
            if(nums[i]>target)
            {
                return i;
            }
        }
        return n;

    }
}