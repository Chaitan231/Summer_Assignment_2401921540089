/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null){
            return true;
        }
        int n=findLength(head);
        int reversePoint=n/2;
        if(n%2!=0){
            reversePoint+=1;
        }
        ListNode prev=findkthNode(head,reversePoint-1);
        ListNode reversePointNode=findkthNode(head,reversePoint);
        ListNode head2=reverse(prev,reversePointNode);
        ListNode first=head,second=head2;
        while(first!=null&&second!=null){
            if(first.val!=second.val){
                return false;
            }
            first=first.next;
            second=second.next;
        }
        return true;
    }
    private int findLength(ListNode head){
        ListNode curr=head;
        int length=0;
        while(curr!=null){
            curr=curr.next;
            length++;
        }
        return length;
    }
    private ListNode findkthNode(ListNode head,int k){
        ListNode current=head;
        for(int cnt=0;cnt<k;cnt++){
            current=current.next;

        }
        return current;
    }
    private ListNode reverse(ListNode prev,ListNode reversePointNode){
        ListNode first=reversePointNode,second=reversePointNode.next;
        while(first!=null&&second!=null){
            ListNode temp=second.next;
            second.next=first;
            first=second;
            second=temp;
           
        }
        prev.next.next=null;
        prev.next=first;
        
        return first;
    }
}