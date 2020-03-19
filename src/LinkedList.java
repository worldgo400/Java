public class LinkedList {
    static class ListNode{
        int val;
        ListNode  next;
        public   ListNode(int val){this.val=val;}
    }
    public ListNode reverseList(ListNode head){
        if (head==null){
            return null;
        }
        if (head.next==null){
            return head;
        }
        ListNode newHead=null;
        ListNode cur=head;
        ListNode prev=null;
        while (cur!=null){
            ListNode next=cur.next;
            if (next==null){
                return newHead=cur;
            }
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        return newHead;
    }
}
