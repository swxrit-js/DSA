class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        
        int[] nums1=new int[n/2];
        int j=0;
        int[] nums2=new int[n/2];
        int k=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]>0)
            {
                nums1[j]=nums[i];
                j++;
            }
            else if(nums[i]<0)
            {
                nums2[k]=nums[i];
                k++;
            }
        }
        int[] ans=new int[n];
        int p=0,q=0;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                ans[i]=nums1[p++];
            }
            else
            {
                ans[i]=nums2[q++];
            }
        }
        return ans;
    }
}