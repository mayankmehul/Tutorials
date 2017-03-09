package interviewbit.linkedlist;

public class MergeSortLinkedList {
	public ListNode sortMyLinkedList(ListNode l) {
		ListNode z = mergeSort(l, l);
		return z;
	}
	
	private ListNode mergeSort(ListNode l, ListNode _head){
		if(l == null||l.next==null){
			return l;
		}
		ListNode a = splitList(l, _head);
		ListNode m = mergeSort(l, _head);
		ListNode n = mergeSort(a, _head);
		ListNode ls = new MergeTwoSortedList().mergeTwoLists(m, n);
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
}
