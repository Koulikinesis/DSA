import java.util.*;
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);   

        int l=1;
        int cur=1;
        for(int i=1;i<nums.length;i++)
        {
          if(nums[i]-nums[i-1]==1)
          {
              cur++;
              if(cur>l) l=cur;
          }
        else  if(nums[i]-nums[i-1]!=0)
          {
              cur=1;
          }
          
        }
        return l;
    }
}