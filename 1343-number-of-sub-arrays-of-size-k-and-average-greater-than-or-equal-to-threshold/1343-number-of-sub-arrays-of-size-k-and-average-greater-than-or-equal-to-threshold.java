class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
      int left=0;
      int sum=0;
      int count=0;
      int n=arr.length;


      for(int right=0;right<n;right++)
      {
        sum+=arr[right];
        int size=right-left+1;

        if(size==k)
        {
            if(sum>=k*threshold)
            {
                count++;
            }
            sum-=arr[left];
            left++;
        }
      }
      return count;
    }
}