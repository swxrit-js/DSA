class Solution {
    
    public void backtrack(int[] nums , int index,List<List<Integer>> arr){
        if(index==nums.length){
            List<Integer> arr1= new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                arr1.add(nums[i]);
            }
            arr.add(new ArrayList<>(arr1));
        }
        for(int i=index; i<nums.length;i++){
            swap(nums, index, i);
            backtrack(nums, index+1, arr);
            swap(nums, index, i);
        }
    }
    public static void swap(int[] arr2, int a, int b){
        int temp = arr2[a];
        arr2[a]= arr2[b];
        arr2[b]= temp;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(nums, 0, ans);
        return ans;
    }
}