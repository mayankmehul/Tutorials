package interviewbit.backtracking;

import interviewbit.linkedlist.ListNode;

public class ReverseLinkListRecursion {
	ListNode head;

	public ListNode reverseList(ListNode a) {
		nextNode(a);
		return head;
	}

	private void nextNode(ListNode p) {
		if (p.next == null) {
			head = p;
			return;
		}
		nextNode(p.next);
		ListNode q = p.next;
		p.next = null;
		q.next = p;
	}
}
