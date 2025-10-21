package Graphs.Representation;

import java.util.ArrayList;
import java.util.List;

public class AdjacencyList {
    public static void main(String[] args) {
        int V = 5;
        int E = 6;
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
        System.out.println(adj);

        adj = new ArrayList<>();

        for (int i = 0; i < V+1; i++) {
            adj.add(new ArrayList<>());
        }

        //directed (s,t)
        for (int i = 0; i < 6 ; i++) {
            int u = edges[i][0];
            int v = edges[i][1];

            adj.get(u).add(v);
        }
        System.out.println(adj);
    }
}
