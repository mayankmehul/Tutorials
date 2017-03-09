package interviewbit.linkedlist;

public class MergeTwoSortedList {
	public ListNode mergeTwoLists(ListNode a, ListNode b) {
		if (a == null && b == null)
			return null;
		ListNode mergedList = null, ahead = a, bhead = b, mlhead = null;
		if (ahead.val < bhead.val) {
			mergedList = ahead;
			ahead = ahead.next;
		} else {
			mergedList = bhead;
			bhead = bhead.next;
		}
		mlhead = mergedList;
		while (ahead != null && bhead != null) {
			if (ahead.val <= bhead.val) {
				mlhead.next = ahead;
				mlhead = mlhead.next;
				ahead = ahead.next;
			} else {
				mlhead.next = bhead;
				mlhead = mlhead.next;
				bhead = bhead.next;
			}
		}
		if (ahead != null)
			mlhead.next = ahead;

		if (bhead != null)
			mlhead.next = bhead;

		return mergedList;
	}
}
