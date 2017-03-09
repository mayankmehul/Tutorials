package interviewbit.linkedlist;

public class SwapListNodePair {
	public ListNode swapPairs(ListNode a) {
		if (a == null || a.next == null)
			return a;
		ListNode ahead = a, prev = null, s1 = null, s2 = null, link = null;
		s1 = ahead;
		s2 = ahead.next;
		link = s2.next;
		s1.next = link;
		s2.next = s1;
		a = s2;
		while (link != null && link.next != null) {
			prev = s1;
			s1 = link;
			s2 = link.next;
			link = s2.next;

			prev.next = s2;
			s2.next = s1;
			s1.next = link;
		}
		return a;
	}
}
