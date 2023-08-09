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
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // If either list is null, return the other list
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        
        // Compare the values of the current nodes in both lists
        if (list1.val < list2.val) {
            // If the value in list1 is smaller, merge list1's next node with the remaining part of list2
            list1.next = mergeTwoLists(list1.next, list2);
            return list1; // Return the merged list starting from list1
        } else {
            // If the value in list2 is smaller or equal, merge list2's next node with the remaining part of list1
            list2.next = mergeTwoLists(list2.next, list1);
            return list2; // Return the merged list starting from list2
        }
    }
}
