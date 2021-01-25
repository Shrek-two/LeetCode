// 21. Merge Two Sorted Lists
// https://leetcode.com/problems/merge-two-sorted-lists/
// January 24 2021 (COMPLETED)



//  Definition for singly-linked list.
// public class ListNode {
//     int val;
//     ListNode next;
//     ListNode() {}
//     ListNode(int val) { this.val = val; }
//     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode newList = new ListNode();
        ListNode head = newList;
        
        if(l1 == null){
            return l2;
        }

        else if(l2 == null){
            return l1;
        }
        
        while(l1 != null && l2 != null){
            if(l1.val >= l2.val){
                newList.next = l2;
                l2 = l2.next;
            }else{
                newList.next = l1;
                l1 = l1.next;
            }
            newList = newList.next;

        }
        if(l1 == null){
            newList.next = l2;
        }else {
            newList.next = l1;
        }

        // curr.next = l1 == null? l2:l1;
        return head.next;
    }
}