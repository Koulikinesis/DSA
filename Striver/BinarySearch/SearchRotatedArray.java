class Solution {
    public int search(int[] nums, int target) {
        int low=0,high=nums.length-1;
        return binarySearch(nums,low,high,target);
    }
    public int binarySearch(int[] nums,int low,int high,int target){
        int mid=(low+high)/2,left=-1,right=-1;
        if(low<=high){
            if(nums[mid]==target)
                return mid;
            else{
                left=binarySearch(nums,low,mid-1,target);
                right=binarySearch(nums,mid+1,high,target);
            }
        }
        return Math.max(left,right);
    }
}