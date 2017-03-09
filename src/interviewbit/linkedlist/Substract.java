package interviewbit.linkedlist;

import java.util.Deque;
import java.util.LinkedList;

public class Substract {
	public ListNode subtract(ListNode a) {
		ListNode p = a;
		Deque<Integer> q = new LinkedList<Integer>();
		int i = 0, size;
		while (p != null) {
			q.add(p.val);
			p = p.next;
			i++;
		}
		size = i;
		i = 0;
		p = a;
		while (i < Math.floor(size / 2)) {
			p.val = q.pollLast() - p.val;
			p = p.next;
			i++;
		}
		return a;
	}
}
