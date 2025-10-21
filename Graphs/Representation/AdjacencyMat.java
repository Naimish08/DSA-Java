package Graphs.Representation;

import java.util.Arrays;

public class AdjacencyMat {
    public static void main(String[] args) {
        int V = 5;
        int[][] edges = {{1,2},{1,3},{2,4},{3,4},{3,5},{4,5}};
        int[][] adj = new int[V+1][V+1];

        //undirected
        for(int[] i:edges){
            adj[i[0]][i[1]]++;
            adj[i[1]][i[0]]++;
        }
        System.out.println(Arrays.deepToString(adj));

        adj = new int[V+1][V+1];
        //directed (s,t)
        for (int[] i:edges){
            adj[i[0]][i[1]]++;
        }
        System.out.println(Arrays.deepToString(adj));

    }
}
