class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public  List<List<Integer>> combinationSum(int[] candidates, int target) {

        getCombinations(candidates,target,0,new ArrayList<>(),target);
        return res;
    }
   public  void getCombinations(int[] candidates,int target, int index,List<Integer> list,int sum){
        if(sum==0){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i=index;i<candidates.length;i++){
            if(sum>=candidates[i]){
                list.add(candidates[i]);
                getCombinations(candidates,target,i,list,sum-candidates[i]);
                list.remove(list.size()-1);
            }
        }

    }
}