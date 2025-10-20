package Puzzles_8;

import java.util.*;

public class EightPuzzleWithMoves {

    static class Node {
        int[] state;
        int g;
        Node parent;
        String move; // Move taken to reach this state

        Node(int[] state, int g, Node parent, String move) {
            this.state = state.clone();
            this.g = g;
            this.parent = parent;
            this.move = move;
        }
    }

    // Manhattan Distance
    public static int manhattanDistance(int[] state, int[] goal) {
        int dist = 0;
        for (int num = 1; num <= 8; num++) {
            int i1 = findIndex(state, num), i2 = findIndex(goal, num);
            int x1 = i1 / 3, y1 = i1 % 3;
            int x2 = i2 / 3, y2 = i2 % 3;
            dist += Math.abs(x1 - x2) + Math.abs(y1 - y2);
        }
        return dist;
    }

    private static int findIndex(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) if (arr[i] == num) return i;
        return -1;
    }

    // Generate neighbors with moves
    public static List<Node> getNeighbors(Node node, int[] goal) {
        List<Node> neighbors = new ArrayList<>();
        int zero = findIndex(node.state, 0);
        int x = zero / 3, y = zero % 3;

        int[][] moves = {{-1,0},{1,0},{0,-1},{0,1}};
        String[] moveNames = {"Up", "Down", "Left", "Right"};

        for (int i = 0; i < moves.length; i++) {
            int nx = x + moves[i][0], ny = y + moves[i][1];
            if (nx >= 0 && nx < 3 && ny >= 0 && ny < 3) {
                int newIndex = nx * 3 + ny;
                int[] newState = node.state.clone();
                // swap
                newState[zero] = newState[newIndex];
                newState[newIndex] = 0;
                neighbors.add(new Node(newState, node.g + 1, node, moveNames[i]));
            }
        }
        return neighbors;
    }

    // BFS Search
    public static Node bfs(int[] start, int[] goal) {
        Queue<Node> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        Node startNode = new Node(start, 0, null, "Start");
        queue.add(startNode);
        visited.add(Arrays.toString(start));

        while (!queue.isEmpty()) {
            Node cur = queue.poll();
            if (Arrays.equals(cur.state, goal)) return cur;

            for (Node neigh : getNeighbors(cur, goal)) {
                String key = Arrays.toString(neigh.state);
                if (!visited.contains(key)) {
                    visited.add(key);
                    queue.add(neigh);
                }
            }
        }
        return null;
    }

    private static List<Node> reconstructPath(Node goalNode) {
        List<Node> path = new ArrayList<>();
        Node cur = goalNode;
        while (cur != null) {
            path.add(cur);
            cur = cur.parent;
        }
        Collections.reverse(path);
        return path;
    }

    private static void printState(int[] state) {
        for (int i = 0; i < 9; i += 3)
            System.out.println(Arrays.toString(Arrays.copyOfRange(state, i, i+3)));
    }

    public static void main(String[] args) {
        int[] start = {1, 2, 3, 4, 0, 6, 7, 5, 8};
        int[] goal  = {1, 2, 3, 4, 5, 6, 7, 8, 0};

        Node goalNode = bfs(start, goal);
        List<Node> path = reconstructPath(goalNode);

        System.out.println("Solution in " + (path.size()-1) + " moves:\n");
        for (Node node : path) {
            System.out.println("Move: " + node.move);
            printState(node.state);
            System.out.println("Manhattan Distance = " + manhattanDistance(node.state, goal));
            System.out.println();
        }
    }
}
