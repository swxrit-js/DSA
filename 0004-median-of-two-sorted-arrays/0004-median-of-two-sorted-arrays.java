import java.util.*;

class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> median = new ArrayList<>();
        for(int i = 0;i<nums1.length;i++)
        {
            median.add(nums1[i]);
        }
        for(int i = 0;i<nums2.length;i++)
        {
            median.add(nums2[i]);
        }
        Collections.sort(median);
        int size = median.size();
        int mid = size/2;
        if(size%2==0)
        {
            double a = median.get(mid);
            double b = median.get(mid-1);
            return (a+b)/2.0;
        }
        return median.get(mid);
        }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] nums1 = new int[m];
        int[] nums2 = new int[n];
        for(int i = 0;i<nums1.length;i++)
        {
            nums1[i] = sc.nextInt();
        }
        for(int i = 0;i<nums2.length;i++)
        {
            nums2[i] = sc.nextInt();
        }
        findMedianSortedArrays(nums1, nums2);
    }
}