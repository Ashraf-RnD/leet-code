package ashraf.rnd.leetcode.reverselinkedlist;

public class Solution {
    public static void main(String[] args) {

    }

    public static ListNode reverseList(ListNode head) {
        ListNode reverseList = null;

        while (head!=null){
            ListNode node = new ListNode(head.val);
            node.next=reverseList;
            reverseList=node;
            if(head.next==null){
                break;
            }
            head=head.next;
        }

        return reverseList;
    }


}
