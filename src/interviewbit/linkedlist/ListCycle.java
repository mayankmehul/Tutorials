package interviewbit.linkedlist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ListCycle {

	public ListNode detectCycle(ListNode a) {
		if(a==null||a.next==null)
			return a;
		ListNode cursor =a, prev=null;;
		Set<ListNode> listVal = new HashSet();
		while(cursor!=null){
			boolean b = listVal.add(cursor);
			if(!b){
				cursor.next=null;
				return cursor;
			}
			prev=cursor;
			cursor=cursor.next;
		}
		return null;
	}
	
	public ListNode turtleAndHare(ListNode a) {
		ListNode turtle = a, hare = a.next, rList;
		while (hare.next != null) {
			if (turtle == hare || turtle == hare.next) {
				//rList = findFirstNode(a, turtle);
				return turtle;
			} else {
				hare = hare.next;
				if (hare.next != null) {
					turtle = turtle.next;
					hare = hare.next;
				}
			}
		}
		return null;
	}
	
	public ListNode detectCycle3(ListNode a) {
		if (a == null || a.next == null)
			return null;

		ListNode point = a, node;
		ArrayList<ListNode> arr = new ArrayList<ListNode>();
		arr.add(point);
		while (point.next != null) {
			point = point.next;
			if (arr.contains(point)) {
				node = point;
				node.next = null;
				return node;
			}
			arr.add(point);
		}
		return null;
	}

	public ListNode detectCycle2(ListNode a) {
		if (a == null || a.next == null) {
			return null;
		}
		ListNode turtle = a, hare = a.next, rList;
		while (hare.next != null) {
			if (turtle == hare || turtle == hare.next) {
				rList = findFirstNode(a, turtle);
				return rList;
			} else {
				hare = hare.next;
				if (hare.next != null) {
					turtle = turtle.next;
					hare = hare.next;
				}
			}
		}
		return null;
	}

	private ListNode findFirstNode(ListNode a, ListNode cyclePoint) {
		if (a == cyclePoint || a == cyclePoint.next) {
			return a;
		}
		ListNode start = a, finish = cyclePoint, point = cyclePoint.next;
		int l = listLength(start, finish);
		int l_new = listLength(start, point);
		while (l < l_new) {
			l = listLength(start, point);
			point = point.next;
			l_new = listLength(start, point);
		}
		point.next = null;
		return point;
	}

	private int listLength(ListNode start, ListNode finish) {
		if (start == finish) {
			return 0;
		}
		int l = 1;
		while (start.next != finish) {
			l++;
			start = start.next;
		}
		return l;
	}
}
