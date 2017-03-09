package interviewbit.linkedlist;

public class PartitionList {
	public ListNode partition(ListNode a, int b) {
		if (a == null || a.next == null) {
			return a;
		}
		ListNode ahead = a, aprev = null, nodelist = null, nodehead = null, temp = null;
		while (ahead != null) {
			if (ahead.val < b) {
				temp = new ListNode(ahead.val);
				if (nodelist == null) {
					nodelist = temp;
					nodehead = nodelist;
				} else {
					nodehead.next = temp;
					nodehead = nodehead.next;
					nodehead.next = null;
				}
				if (aprev == null) {
					ahead = ahead.next;
					a = a.next;
				} else {
					aprev.next = ahead.next;
					ahead = ahead.next;
				}
			} else {
				aprev = ahead;
				ahead = ahead.next;
			}
		}
		if(nodelist!=null){
			nodehead.next=a;
			return nodelist;
		}
		return a;
	}
}
