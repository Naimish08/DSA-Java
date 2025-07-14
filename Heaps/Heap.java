package Heaps;

public class Heap {
    int[] arr;
    int size;
    int heapSize;
    public Heap(int[] arr) {
        this.arr = arr;
        this.size = arr.length;
        heapSize = 0;
    }

    void heapify(int k) {
        
    }

    int parent(int i) {
        return (i - 1) / 2;
    }

    int left(int i) {
        return i * 2 + 1;
    }

    int right(int i) {
        return i * 2 + 2;
    }
}
