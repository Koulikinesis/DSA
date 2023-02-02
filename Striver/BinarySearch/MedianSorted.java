class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];
        int n1 = 0, n2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (n2 >= nums2.length || (n1 < nums1.length && nums1[n1] < nums2[n2])) {
                arr[i] = nums1[n1++];
            } else {
                arr[i] = nums2[n2++];
            }
        }

        double median;
        if (arr.length % 2 == 0) {
            median = ((double) arr[(arr.length - 1) / 2] + (double) arr[(arr.length) / 2]) / 2;
        } else {
            median = arr[arr.length / 2];
        }
        return median;
    }
}