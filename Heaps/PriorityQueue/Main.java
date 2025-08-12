package Heaps.PriorityQueue;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        //
        pq.add(6);
        pq.add(2);
        pq.add(7);
        pq.add(4);
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
        pq.add(2);
        System.out.println(pq);
    }
}
