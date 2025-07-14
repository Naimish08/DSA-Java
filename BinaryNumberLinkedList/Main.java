package BinaryNumberLinkedList;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {1,0,0,0};
        ListNode head = new ListNode(arr[0]);
        ListNode temp = head;
        for(int i=1;i<arr.length;i++){
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }
        System.out.println(s.getDecimalValue(head));
    }
}
