class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> main=new ArrayList<>();
        ArrayList<Integer>ans=new ArrayList<>();
        seq(nums,ans,0,main);
        return main;
    }
    
    void seq(int[] nums, ArrayList<Integer> ans ,int i,List<List<Integer>> main) {
        if (i==nums.length){
            main.add(new ArrayList<>(ans));
            return;
        }
        ans.add(nums[i]);
        //- Taking Values in here
        seq(nums,ans,i+1,main);
        ans.remove(ans.size()-1);
        //- Here,we are not taking in values
        seq(nums,ans,i+1,main);
}
}