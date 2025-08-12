package Heaps;

import java.util.Arrays;

public class Heap {
    int size;
    int heapSize;
    int[] arr;
    public Heap(int size) {
        this.size = size;
        heapSize = 0;
        arr = new int[size];
    }

    void maxHeapify(int i){
        int l = left(i);
        int r = right(i);
        int largest = i;
        if(l<heapSize && arr[largest]<arr[l]){
            largest = l;
        }
        if(r<heapSize && arr[r]>arr[largest]){
            largest = r;
        }
        if(largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            maxHeapify(largest);
        }
    }


    void insertKey(int key){
        if(heapSize == size){
            System.out.println("Heap is full");
            return;
        }
        heapSize++;
        int i = heapSize-1;
        arr[i] = key;

        while(i!=0 && arr[parent(i)]<arr[i]){
            int temp = arr[i];
            arr[i] = arr[parent(i)];
            arr[parent(i)] = temp;
            i = parent(i);
        }
    }

    int deleteKey(){
        if (heapSize <= 0)
            return Integer.MIN_VALUE;
        if (heapSize == 1) {
            heapSize--;
            return arr[0];
        }

        int root = arr[0];
        arr[0] = arr[heapSize - 1];
        heapSize--;

        maxHeapify(0);

        return root;

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

    @Override
    public String toString() {
        return "Heap{" +
                "size=" + size +
                ", heapSize=" + heapSize +
                ", arr=" + Arrays.toString(arr) +
                '}';
    }
}
