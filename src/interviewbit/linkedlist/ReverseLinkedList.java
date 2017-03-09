package interviewbit.linkedlist;

public class ReverseLinkedList {
	public ListNode reverseList(ListNode a) {
		if (a == null || a.next == null)
			return a;
		ListNode prev = null, curr = a, link = a.next, head;
		while (link.next != null) {
			curr.next = prev;
			prev = curr;
			curr = link;
			link = link.next;
		}
		curr.next = prev;
		link.next=curr;
		head = link;
		return head;
	}
}
