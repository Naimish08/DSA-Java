package Heaps;

public class Main {
    public static void main(String[] args) {
        int[] arr = {50,30,20,15,10,8,16,60};
        Heap heap = new Heap(8);
        for(int i:arr){
            heap.insertKey(i);
        }
        System.out.println(heap);
        System.out.println(heap.deleteKey());
    }
}