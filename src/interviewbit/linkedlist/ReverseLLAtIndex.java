package interviewbit.linkedlist;

public class ReverseLLAtIndex {
	public ListNode reverseBetween(ListNode a, int m, int n) {
		if (a == null || a.next == null)
			return a;

		int i = 1;
		ListNode point, front = a, end = a, listR = a, prev, rList;
		if (m == 1) {
			front = null;
		} else {
			prev = a;
			while (i < m) {
				prev = a;
				a = a.next;
				i++;
			}
			prev.next = null;
		}
		point = a;
		end = a;
		while (i <= n) {
			if (end == null) {
				break;
			}
			i++;
			point = end;
			end = end.next;
		}
		point.next = null;
		listR = a;
		rList = reverseList(listR);
		a = appendListNodes(front, rList, end);
		return a;
	}

	private ListNode reverseList(ListNode a) {
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
		link.next = curr;
		head = link;
		return head;
	}

	private ListNode appendListNodes(ListNode front, ListNode mid, ListNode end) {
		ListNode a = front, point = front;
		if (front == null)
			a = mid;
		else
			while (point.next != null) {
				point = point.next;
			}

		if (point == null)
			point = mid;
		else
			point.next = mid;

		if (mid != null)
			while (point.next != null) {
				point = point.next;
			}

		if (point == null)
			point = end;
		else
			point.next = end;

		return a;
	}
}