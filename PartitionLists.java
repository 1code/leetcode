/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        //Use the original node to finish, didn't create any new node
        ListNode smaller = null, larger = null, smallerC = null, largerC = null;
        while(head != null){
            if(head.val >= x){
                if(larger == null){
                    larger = head;
                    largerC = larger;
                }
                else{
                    largerC.next = head;
                    largerC = largerC.next;
                }
                head = head.next;
                largerC.next = null;
            }
            else{
                if(smaller == null){
                    smaller = head;
                    smallerC = smaller;
                }
                else{
                    smallerC.next = head;
                    smallerC = smallerC.next;
                }
                head = head.next;
                smallerC.next = null;
            }
        }
        if(smaller != null){
            smallerC.next = larger;
            return smaller;
        }
        return larger;
    }
}