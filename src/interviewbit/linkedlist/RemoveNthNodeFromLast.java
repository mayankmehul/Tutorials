package interviewbit.linkedlist;

public class RemoveNthNodeFromLast {
	public ListNode removeNthFromEnd(ListNode a, int b) {
		int l = lenghtOfList(a);
		if (l <= b) {
			a = a.next;
			return a;
		}
		if (b == 0)
			b = 1;

		int x = l - b, i = 1;
		ListNode head = a;
		while (i < x) {
			head = head.next;
			i++;
		}
		head.next = head.next.next;
		return a;
	}

	private int lenghtOfList(ListNode a) {
		ListNode head = a;
		int l = 0;
		while (head != null) {
			head = head.next;
			l++;
		}
		return l;
	}
}
