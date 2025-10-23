package Graphs.Rotting_Oranges;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public int orangesRotting(int[][] grid) {
        List<List<Integer>> rc = new LinkedList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 2) {
                    rc.add(List.of(i, j));
                }
            }
        }

        boolean[][] visited = new boolean[grid.length][grid[0].length];
        Queue<List<Integer>> q = new LinkedList<>();
        for (int i = 0; i < rc.size(); i++) {
            q.offer(rc.get(i));
            visited[rc.get(i).get(0)][rc.get(i).get(1)] = true;
        }

        int cnt = -1; // count minutes, start at -1 so first level becomes 0
        int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        while (!q.isEmpty()) {
            int size = q.size();
            cnt++;
            for (int s = 0; s < size; s++) {
                List<Integer> curr = q.poll();
                int r = curr.get(0);
                int c = curr.get(1);

                for (int[] d : dirs) {
                    int nr = r + d[0];
                    int nc = c + d[1];
                    if (nr >= 0 && nr < grid.length && nc >= 0 && nc < grid[0].length
                            && grid[nr][nc] == 1 && !visited[nr][nc]) {
                        visited[nr][nc] = true;
                        grid[nr][nc] = 2;
                        q.offer(List.of(nr, nc));
                    }
                }
            }
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    return -1;
                }
            }
        }

        return Math.max(cnt, 0);
    }
}
