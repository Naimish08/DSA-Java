package Graphs.ConnectedComponents;
class Solution {
    public int findCircleNum(int[][] isConnected) {
        boolean[] visited = new boolean[isConnected.length];

        int count = 0;
        for(int i=0;i<isConnected.length;i++){
            if(!visited[i]){
                dfs(isConnected,visited,i);
                count++;
            }
        }

        return count;
    }

    public void dfs(int[][] isConnected,boolean[] visited,int node){
        visited[node] = true;

        for(int i=0;i<isConnected.length;i++){
            if(isConnected[node][i] == 1){
                if(!visited[i]){
                    visited[i] = true;
                    dfs(isConnected,visited,i);
                }
            }
        }
    }
}
