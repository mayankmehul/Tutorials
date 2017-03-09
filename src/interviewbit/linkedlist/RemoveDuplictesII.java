package interviewbit.linkedlist;

public class RemoveDuplictesII {
	public ListNode deleteDuplicates(ListNode a) {
		if (a == null || a.next == null) {
			return a;
		}
		ListNode point = a.next, prev = a;
		while (point != null) {
			while (prev.val == point.val) {
				if (point.next != null) {
					prev.next = point.next;
					point = point.next;
				} else {
					prev.next = null;
					return a;
				}
			}
			prev = prev.next;
			point = point.next;
		}
		return a;
	}
}
