package BinaryNumberLinkedList;

class Solution {
    public int getDecimalValue(ListNode head) {
        if(head.next == null){
            return head.val;
        }
        ListNode temp = null;
        ListNode p1 = head;
        ListNode p2 = head.next;
        while(p2.next != null){
            p1.next = temp;
            temp = p1;
            p1 = p2;
            p2 = p2.next;
            p1.next = temp;
        }
        p2.next = p1;
        head = p2;
        int x = 0;
        temp = head;
        int ans = 0;
        while(temp != null){
            ans += temp.val*(1<<(x++));
            temp = temp.next;
        }
        return ans;
    }
}
