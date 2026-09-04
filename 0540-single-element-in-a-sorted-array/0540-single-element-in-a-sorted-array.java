class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        if(nums.length==1) return nums[0];
        if(nums[0]!=nums[1]) return nums[0];
        if(nums[n-1]!=nums[n-2]) return nums[n-1];
        int left=0;
        int right=n-1;

        while(left<=right)
        {
            int mid=left+(right-left)/2;

            if(nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1]) return nums[mid];
            int p= mid,d=mid;
            if(nums[mid-1]==nums[mid]) p=mid-1;
            else d=mid+1;

            int leftCount=p-left;

            if(leftCount%2==0) left=d+1;
            else right=p-1;
        }
        return 489118;
    }
}