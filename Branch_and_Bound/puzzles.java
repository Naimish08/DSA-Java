package Branch_and_Bound;
import java.util.*;

class PuzzleNode implements Comparable<PuzzleNode> {
    int[][] board;
    int x, y; // position of the blank (0)
    int cost; // f(x) = g(x) + h(x)
    int level; // g(x): number of moves from root
    PuzzleNode parent;

    public PuzzleNode(int[][] board, int x, int y, int level, PuzzleNode parent) {
        this.board = new int[4][4];
        for (int i = 0; i < 4; i++)
            this.board[i] = board[i].clone();
        this.x = x;
        this.y = y;
        this.level = level;
        this.parent = parent;
        this.cost = level + manhattanDistance(this.board);
    }

    public int compareTo(PuzzleNode other) {
        return this.cost - other.cost;
    }

    public static int manhattanDistance(int[][] state) {
        int distance = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int val = state[i][j];
                if (val != 0) {
                    int targetX = (val - 1) / 4;
                    int targetY = (val - 1) % 4;
                    distance += Math.abs(i - targetX) + Math.abs(j - targetY);
                }
            }
        }
        return distance;
    }

    public boolean isGoal() {
        int val = 1;
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                if (i == 3 && j == 3) return board[i][j] == 0;
                else if (board[i][j] != val++) return false;
        return true;
    }

    public static List<PuzzleNode> getChildren(PuzzleNode node) {
        List<PuzzleNode> children = new ArrayList<>();
        int[] dx = {-1, 1, 0, 0}; // Up, Down, Left, Right
        int[] dy = {0, 0, -1, 1};
        for (int dir = 0; dir < 4; dir++) {
            int newX = node.x + dx[dir];
            int newY = node.y + dy[dir];
            if (newX >= 0 && newX < 4 && newY >= 0 && newY < 4) {
                int[][] newBoard = new int[4][4];
                for (int i = 0; i < 4; i++)
                    newBoard[i] = node.board[i].clone();
                // Swap 0 with adjacent
                newBoard[node.x][node.y] = newBoard[newX][newY];
                newBoard[newX][newY] = 0;
                children.add(new PuzzleNode(newBoard, newX, newY, node.level + 1, node));
            }
        }
        return children;
    }

    public void printPath() {
        if (parent != null)
            parent.printPath();
        printBoard(this.board);
        System.out.println();
    }

    public static void printBoard(int[][] board) {
        for (int[] row : board) {
            for (int val : row)
                System.out.print((val == 0 ? " " : val) + "\t");
            System.out.println();
        }
    }
}

public class puzzles {
    public static void solve(int[][] initialBoard) {
        int x = 0, y = 0;

        // Find blank (0) position
        outer:
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                if (initialBoard[i][j] == 0) {
                    x = i;
                    y = j;
                    break outer;
                }

        PriorityQueue<PuzzleNode> pq = new PriorityQueue<>();
        PuzzleNode root = new PuzzleNode(initialBoard, x, y, 0, null);
        pq.add(root);

        Set<String> visited = new HashSet<>();

        while (!pq.isEmpty()) {
            PuzzleNode current = pq.poll();
            if (current.isGoal()) {
                System.out.println("Solution found in " + current.level + " moves:");
                current.printPath();
                return;
            }

            String stateKey = Arrays.deepToString(current.board);
            if (visited.contains(stateKey))
                continue;
            visited.add(stateKey);

            for (PuzzleNode child : PuzzleNode.getChildren(current)) {
                String childKey = Arrays.deepToString(child.board);
                if (!visited.contains(childKey))
                    pq.add(child);
            }
        }

        System.out.println("No solution found.");
    }

    public static void main(String[] args) {
        int[][] initial = {
                {1, 2, 3, 4},
                {5, 6, 0, 8},
                {9, 10, 7, 11},
                {13, 14, 15, 12}
        };

        solve(initial);
    }
}