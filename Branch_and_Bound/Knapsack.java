package Branch_and_Bound;
import java.util.*;

class Item {
    int weight, value;
    double ratio;

    public Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
        this.ratio = (double) value / weight;
    }
}

class Node implements Comparable<Node> {
    int level, profit, weight;
    double bound;

    public Node(int level, int profit, int weight) {
        this.level = level;
        this.profit = profit;
        this.weight = weight;
    }

    @Override
    public int compareTo(Node other) {
        return Double.compare(other.bound, this.bound); // Max-heap based on bound
    }
}

public class Knapsack {
    static int maxProfit = 0;

    static double bound(Node u, int n, int W, Item[] items) {
        if (u.weight >= W) return 0;
        double profitBound = u.profit;
        int j = u.level + 1;
        int totalWeight = u.weight;

        while (j < n && totalWeight + items[j].weight <= W) {
            totalWeight += items[j].weight;
            profitBound += items[j].value;
            j++;
        }

        if (j < n) {
            profitBound += (W - totalWeight) * items[j].ratio;
        }
        return profitBound;
    }

    static void knapsack(int W, Item[] items, int n) {
        Arrays.sort(items, (a, b) -> Double.compare(b.ratio, a.ratio));
        PriorityQueue<Node> pq = new PriorityQueue<>();
        Node u = new Node(-1, 0, 0);
        u.bound = bound(u, n, W, items);
        pq.add(u);

        while (!pq.isEmpty()) {
            u = pq.poll();
            if (u.bound <= maxProfit) continue;
            if (u.level == n - 1) continue;

            Node v = new Node(u.level + 1, u.profit + items[u.level + 1].value,
                    u.weight + items[u.level + 1].weight);
            if (v.weight <= W && v.profit > maxProfit) {
                maxProfit = v.profit;
            }
            v.bound = bound(v, n, W, items);
            if (v.bound > maxProfit) pq.add(v);

            v = new Node(u.level + 1, u.profit, u.weight);
            v.bound = bound(v, n, W, items);
            if (v.bound > maxProfit) pq.add(v);
        }
    }

    public static void main(String[] args) {
        int W = 50;
        Item[] items = {
                new Item(60, 10),
                new Item(100, 20),
                new Item(120, 30)
        };
        knapsack(W, items, items.length);
        System.out.println("Maximum profit: " + maxProfit); // Output: 220
    }
}
