import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;
        int[] mergedArray = new int[len];
        int count = 0;
        for (int i = 0; i < nums1.length; i++){
            mergedArray[i] = nums1[i];
            count++;
        }
        for (int i = 0; i < nums2.length; i++){
            mergedArray[count] = nums2[i];
            count++;
        }

        Arrays.sort(mergedArray);

        if (len%2 == 1 ){
            return (double) mergedArray[(len/2)];
        } 

        return (double) (mergedArray[(len/2)-1] + mergedArray[(len/2)])/2.0;
    }
}