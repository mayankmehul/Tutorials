package interviewbit.linkedlist;

public class IntersectionOfLL {
	public ListNode getIntersectionNode(ListNode a, ListNode b) {
		if (a == null || b == null)
			return null;

		ListNode aHead = a;
		ListNode bHead = b;
		int a_lenght = getListNodeLenght(a);
		int b_lenght = getListNodeLenght(b);

		while (aHead.next != null && bHead.next != null) {
			if (aHead.next == bHead.next) {
				if (aHead == bHead) {
					return aHead;
				} else
					return aHead.next;
			} else {
				if (a_lenght == b_lenght) {
					aHead = aHead.next;
					bHead = bHead.next;
					a_lenght--;
					b_lenght--;
				} else {
					if (a_lenght > b_lenght) {
						aHead = aHead.next;
						a_lenght--;
					} else {
						bHead = bHead.next;
						b_lenght--;
					}
				}
			}
		}
		if (aHead.next == null && bHead.next != null) {
			while (bHead.next != null) {
				if (aHead == bHead) {
					return aHead;
				}
				bHead = bHead.next;
			}
		}
		if (bHead.next == null && aHead.next != null) {
			while (aHead.next != null) {
				if (aHead == bHead) {
					return bHead;
				}
				aHead = aHead.next;
			}
		}
		if (aHead == bHead) {
			return aHead;
		}
		return null;
	}

	private int getListNodeLenght(ListNode a) {
		ListNode head = a;
		int l = 1;
		while (head.next != null) {
			l++;
			head = head.next;
		}
		return l;
	}
}
