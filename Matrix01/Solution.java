package Matrix01;

import java.util.*;

class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int[][] ans = new int[mat.length][mat[0].length];

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j] == 1){
                    ans[i][j] = bfs(mat,i,j);
                }
            }
        }

        return ans;
    }

    public int bfs(int[][] mat,int r,int c){
        Queue<List<Integer>> q = new LinkedList<>();
        boolean[][] visited = new boolean[mat.length][mat[0].length];
        q.offer(List.of(r,c));
        visited[r][c] = true;

        int[][] dq = {{1,0},{-1,0},{0,1},{0,-1}};
        int cnt = 0;
        while(!q.isEmpty()){
            int size = q.size();

            for(int i=0;i<size;i++){
                List<Integer> curr = q.poll();
                int m = curr.get(0);
                int n = curr.get(1);

                if(mat[m][n] == 0){
                    return cnt;
                }

                for(int[] j:dq){
                    int row_cordinates = m + j[0];
                    int col_cordinates = n + j[1];

                    if(row_cordinates>=0 && col_cordinates<mat[0].length &&
                            col_cordinates>=0 && row_cordinates<mat.length &&
                            !visited[row_cordinates][col_cordinates]){

                        visited[row_cordinates][col_cordinates] = true;
                        q.offer(List.of(row_cordinates,col_cordinates));
                    }
                }
            }
            cnt++;
        }
        return -1;
    }
}
