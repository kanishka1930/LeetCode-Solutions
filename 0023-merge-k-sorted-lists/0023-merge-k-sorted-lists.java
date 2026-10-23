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
    public ListNode mergeKLists(ListNode[] lists) {

        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b) -> Integer.compare(a.val , b.val));

        //step 1 - har list ka pehla node add karna hai

        for(ListNode node : lists){
            if(node != null){
                pq.offer(node);
            }
        }
        //step 2- marged list banane ke liye
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        //step 3- jab tak queue empty nahi hoti
        while(!pq.isEmpty()){

            ListNode smallest = pq.poll();

            //chota node marged list main jodo 

            tail.next = smallest;
            tail = tail.next;

            //uska agla node queue main add karo

            if(smallest.next != null){
                pq.offer(smallest.next);
            }

        
    }
    return dummy.next;
}
}