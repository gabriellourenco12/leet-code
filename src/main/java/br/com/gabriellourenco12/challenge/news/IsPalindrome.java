package br.com.gabriellourenco12.challenge.news;

import br.com.gabriellourenco12.challenge.news.model.ListNode;

public class IsPalindrome {
    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        ListNode secondHalf = getSecondHalf(head);
        secondHalf = reverse(secondHalf, null);

        return compareListNode(head, secondHalf);
    }

    private static ListNode getSecondHalf(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.next;
    }

    private static ListNode reverse(ListNode node, ListNode prev){
        if(node == null) return prev;
        ListNode next = node.next;
        node.next = prev;
        return reverse(next, node);
    }

    private static boolean compareListNode(ListNode head, ListNode secondHalf) {
        while (head != null && secondHalf != null) {
            if (head.val != secondHalf.val) {
                return false;
            }
            head = head.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }

    public static void main(String[] args)
    {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
        ListNode listNode2 = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(3))));
        System.out.println("1221: " + isPalindrome(listNode));
        System.out.println("1223: " + isPalindrome(listNode2));
    }
}
