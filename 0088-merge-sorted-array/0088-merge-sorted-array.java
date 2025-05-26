class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int p1 = m - 1;
        int p2 = n - 1;
        int p3 = nums1.length - 1;

        while (p3 >= 0) {
            int val1 = p1 >= 0 ? nums1[p1] : Integer.MIN_VALUE;
            int val2 = p2 >= 0 ? nums2[p2] : Integer.MIN_VALUE;

            if (val1 > val2) {
                nums1[p3] = val1;
                p1--;
            } else {
                nums1[p3] = val2;
                p2--;
            }
            p3--;
        }
    }
    // In this question we have to merge two sorted array, but the catch is we have to merge
    // array in the first array that means no extra space 
    //so Here we have taken  3 pointer first on m second on n and p3 on last index of nums1 array 
    // and started traversing the array, we have started traversing from last and taken the maximum
    // value of the two array and put it in the array , we have started from the last just to ensure 
    // no data is lost if we start from 0 index then there will data lost 
}