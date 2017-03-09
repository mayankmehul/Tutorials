package interviewbit.linkedlist;

public class RemoveDuplicates {
	public ListNode deleteDuplicates(ListNode a) {
		if (a == null || a.next == null) {
			return a;
		}
		ListNode head = a, point = a.next, prev = a, parent = null;
		while (point != null) {
			if (prev.val == point.val) {
				while (prev.val == point.val) {
					if (point.next == null) {
						if (parent == null) {
							return null;
						} else {
							parent.next = null;
							return a;
						}
					}
					point = point.next;
				}
				if (parent == null) {
					a = point;
				} else {
					parent.next = point;
				}
			} else {
				parent = prev;
			}
			prev = point;
			point = point.next;
		}
		return a;
	}
}
