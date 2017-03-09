package interviewbit.linkedlist;

public class SortList {
	public ListNode sortList(ListNode a) {
		ListNode z = mergeSort(a, a);
		return z;
	}
	
	private ListNode mergeSort(ListNode l, ListNode _head){
		if(l == null||l.next==null){
			return l;
		}
		ListNode a = splitList(l, _head);
		ListNode m = mergeSort(l, _head);
		ListNode n = mergeSort(a, _head);
		ListNode ls = mergeTwoLists(m, n);
		return ls;
	}
	
	private ListNode splitList(ListNode l, ListNode _head) {
		if(l == null||l.next==null){
			return l;
		}
		ListNode slow = l, fast = l.next;
		while(fast.next!=null){
			fast=fast.next;
			if(fast.next!=null){
				slow=slow.next;
				fast=fast.next;
			}
		}
		ListNode temp = slow.next;
		slow.next=null;
		return temp;
	}
	
	private ListNode mergeTwoLists(ListNode a, ListNode b) {
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
