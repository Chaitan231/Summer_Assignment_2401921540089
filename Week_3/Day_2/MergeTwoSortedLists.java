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
class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode fp=list1,sp=list2,node=null;
        ListNode head=null,tail=null;
        while(fp!=null||sp!=null){
            if(fp!=null&&sp!=null){
                if(fp.val<=sp.val){
                    node=fp;
                    fp=fp.next;
                }
                else{
                    node=sp;
                    sp=sp.next;
                }
            }
            else if(fp!=null){
                node=fp;
                fp=fp.next;
            }
            else{
                node=sp;
                sp=sp.next;
            }
            tail=insertAtEnd(tail,node.val);
            if(head==null){
                head=tail;
            }
        }
        return head;
    }
    private ListNode insertAtEnd(ListNode tail,int val){
        ListNode nodeToBeInserted=new ListNode(val);
        if(tail!=null){
            tail.next=nodeToBeInserted;
        }
        return nodeToBeInserted;
    }
}