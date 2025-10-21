package Graphs.Traversal;

import java.util.ArrayList;
import java.util.List;

public class DFS {
    public static void main(String[] args) {
        int V = 5;
        int E = 6;
        int s = 1;
        int[][] edges = {{1,2},{1,3},{2,4},{3,4},{3,5},{4,5}};
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V+1; i++) {
            adj.add(new ArrayList<>());
        }

        // undirected
        for (int i = 0; i <6 ; i++) {
            int u = edges[i][0];
            int v = edges[i][1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] visited = new boolean[adj.size()];
        dfssolve(1,adj,visited,ans);

        System.out.println(ans);
    }

    public static void dfssolve(int node,ArrayList<ArrayList<Integer>> adj,boolean[] visited,ArrayList<Integer> ans){
        visited[node] = true;
        ans.add(node);
        for(Integer it:adj.get(node)){
            if(!visited[it]){
                dfssolve(it,adj,visited,ans);
            }
        }
    }
}
