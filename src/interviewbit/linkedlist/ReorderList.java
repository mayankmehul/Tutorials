package interviewbit.linkedlist;

import java.util.HashMap;

public class ReorderList {

	public ListNode reorderList(ListNode a) {
		if (a == null || a.next == null)
			return a;
		ListNode front = a, p = a, rear = p.next;
		HashMap<Integer, ListNode> m = new HashMap();
		Integer l = 1;
		while (p != null) {
			m.put(l, p);
			l++;
			p = p.next;
		}
		l--;
		while (front != null && front.next != null) {
			p = m.get(--l);
			rear = p.next;
			p.next = null;
			rear.next = front.next;
			front.next = rear;
			front = rear.next;
		}
		return a;
	}

	public ListNode reorderList2(ListNode a) {
		if (a == null || a.next == null)
			return a;
		ListNode front = a, p = a, rear = p.next;
		while (front != p) {
			p.next = null;
			rear.next = front.next;
			front.next = rear;
			front = rear.next;
			p = lastNode(front);
			if (p == null)
				break;
			rear = p.next;
		}
		return a;
	}

	private ListNode lastNode(ListNode l) {
		if (l.next == null)
			return null;
		ListNode p = l;
		while (p.next.next != null) {
			p = p.next;
		}
		return p;
	}
}
