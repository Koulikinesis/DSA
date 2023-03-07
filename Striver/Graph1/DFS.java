package Striver.Graph1;

import java.util.ArrayList;

public class DFS {    
      public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> list = new ArrayList<>();
       list.add(0);
       dfs(0 , list , adj);
       return list;
    }
    private static void dfs(int node , ArrayList<Integer> list ,ArrayList<ArrayList<Integer>> adj){
        for(Integer it : adj.get(node)){
            if(!list.contains(it)) {
                list.add(it);
                dfs(it , list , adj);
            }
        }
    }
}
