package interviewbit.linkedlist;

public class InsertionSort {
	public ListNode insertionSortList(ListNode a) {
		ListNode q = a, m, n;
		int l = 0;
		while (q != null) {
			q = q.next;
			l++;
		}
		while (l > 0) {
			q = null;
			m = a;
			n = a.next;
			while (n != null) {
				if (m.val > n.val) {
					if (q == null) {
						m.next = n.next;
						n.next = m;
						a = n;
						q = n;
					} else {
						m.next = n.next;
						n.next = m;
						q.next = n;
						q = n;
					}
					m = q.next;
					n = m.next;
				} else {
					m = m.next;
					n = n.next;
					if (q == null)
						q = a;
					else
						q = q.next;
				}
			}
			l--;
		}
		return a;
	}
}
