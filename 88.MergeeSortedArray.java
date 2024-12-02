//88.Merge sorted array

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        int start  = m;
        int  i = 0;
        while(i<n)
        {
            nums1[start] = nums2[i];
            i++;
            start++;
        }
        Arrays.sort(nums1);
    }
}
