package ashraf.rnd.leetcode.listpalindrome;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Solution {
    public static void main(String[] args) {
        int[] array = {1, 2, 3,  1};
        ListNode head = new ListNode(1);
        for (int i = 1; i < array.length; i++) {
            insert(array[i], head);
        }

        ListNode slow = getHalfList(head, head);
        slow = reverseList(null,slow);

        var pal = checkPalindrome(slow, head);
        System.out.println("palindrome = " + pal);
//        traverse(slow);

    }

    public static boolean dfs(ListNode head, ListNode node) {
        if (head == null || head.next == null) {
            return true;
        } else if (node.next == null) {
            return head.val == node.val;
        } else if (node.next.next != null) {
            return dfs(head, node.next);
        } else if (head.val == node.next.val) {
            node.next = null;
            return dfs(head.next, head.next);
        } else {
            return false;
        }

    }

    public static ListNode getHalfList(ListNode slow, ListNode fast) {
        if (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            return getHalfList(slow, fast);
        }
        return slow;
    }

    public static boolean checkPalindrome(ListNode slow, ListNode fast) {
        if (slow == null) {
            return true;
        } else if (slow.val == fast.val) {
            slow = slow.next;
            fast = fast.next;
            return checkPalindrome(slow, fast);
        } else {
            return false;
        }
    }

    public static ListNode insert(int val, ListNode head) {
        if (head == null) {
            return new ListNode(val);
        } else if (head.next == null) {
            head.next = new ListNode(val);
            return head;
        } else {
            return insert(val, head.next);
        }
    }

    public static void traverse(ListNode head) {
        if (head != null) {
            System.out.print(head.val);
            traverse(head.next);
        }
    }

    public static ListNode reverseList(ListNode head) {
        ListNode reverseList = null;

        while (head != null) {
            ListNode node = new ListNode(head.val);
            node.next = reverseList;
            reverseList = node;
            if (head.next == null) {
                break;
            }
            head = head.next;
        }

        return reverseList;
    }

    public static ListNode reverseList(ListNode reverseList, ListNode head){
        if (head==null){
            return reverseList;
        }else {
            ListNode node = new ListNode(head.val);
            node.next = reverseList;
            reverseList = node;
            return reverseList(reverseList,head.next);
        }
    }
}
