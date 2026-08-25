class Solution {
    public int missingMultiple(int[] nums, int k) {
        int j=1;
        while(true)
        {
            int target=k*j;
            boolean find=false;

            for(int ele:nums)
            {
                if(ele==target)
                {
                    find = true;
                    break;
                }
            }
            if(!find)
            {
                return target;
            }
            
            j++; 
        } 
    }
}