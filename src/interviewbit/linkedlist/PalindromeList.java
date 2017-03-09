package interviewbit.linkedlist;

public class PalindromeList {
	public int listPalindrome(ListNode A) {
		ListNode b = reverseList(A);
		ListNode ahead = A, bhead = b;
		while (ahead != null) {
			if (ahead.val != bhead.val) {
				return 0;
			}
			ahead = ahead.next;
			bhead = bhead.next;
		}
		return 1;
	}

	private ListNode reverseList(ListNode z) {
		if (z == null)
			return z;

		ListNode temp, node, a = z;
		temp = new ListNode(a.val);
		a = a.next;
		while (a != null) {
			node = new ListNode(a.val);
			node.next = temp;
			temp = node;
			a = a.next;
		}
		return temp;
	}
}
