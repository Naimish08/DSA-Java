package Graphs.FloodFill;


import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        Queue<List<Integer>> q = new LinkedList<>();
        q.offer(List.of(sr,sc));

        int og = image[sr][sc];
        image[sr][sc] = color;
        boolean[][] visited = new boolean[image.length][image[0].length];
        visited[sr][sc] = true;
        int[][] dr = {{-1,0},{1,0},{0,-1},{0,1}};

        while(!q.isEmpty()){
            int size = q.size();

            for(int i=0;i<size;i++){
                List<Integer> curr = q.poll();
                int m = curr.get(0);
                int n = curr.get(1);
                for(int[] j:dr){
                    int rd = m+j[0];
                    int cd = n+j[1];

                    if(rd>=0 && cd<image[0].length && rd<image.length && cd>=0 && !visited[rd][cd] &&
                            image[rd][cd] == og){
                        image[rd][cd] = color;
                        visited[rd][cd] = true;
                        q.offer(List.of(rd,cd));
                    }
                }
            }
        }

        return image;
    }
}