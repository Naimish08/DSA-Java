package Graphs.Traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
    public static void main(String[] args) {
        int V = 5;
        int E = 6;
        int s = 1;
        int[][] edges = {{1,2},{1,3},{2,4},{3,4},{3,5},{4,5}};
        List<List<Integer>> adj = new ArrayList<>();

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

        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[V+1];

        q.offer(s);
        visited[s] = true;

        while(!q.isEmpty()){
            int curr = q.poll();
            System.out.print(curr+" ");

            for(Integer it:adj.get(curr)){
                if(!visited[it]){
                    visited[it] = true;
                    q.offer(it);
                }
            }
        }
    }
}
