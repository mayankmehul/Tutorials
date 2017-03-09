package interviewbit.linkedlist;

public class Add2NumberList {
	public ListNode addTwoNumbers(ListNode a, ListNode b) {
		if (a == null)
			return b;
		if (b == null)
			return a;
		int carry = 0;
		ListNode sum = null, sumhead = null, temp = null, ahead = a, bhead = b;

		int s = ahead.val + bhead.val + carry;
		carry = 0;
		if (s > 9) {
			carry = s / 10;
			s = s % 10;
		}
		sum = new ListNode(s);
		ahead = ahead.next;
		bhead = bhead.next;
		sumhead = sum;

		while (ahead != null && bhead != null) {
			s = ahead.val + bhead.val + carry;
			carry = 0;
			if (s > 9) {
				carry = s / 10;
				s = s % 10;
			}
			temp = new ListNode(s);
			sumhead.next = temp;
			ahead = ahead.next;
			bhead = bhead.next;
			sumhead = sumhead.next;
		}
		while (ahead != null) {
			s = ahead.val + carry;
			carry = 0;
			if (s > 9) {
				carry = s / 10;
				s = s % 10;
			}
			temp = new ListNode(s);
			sumhead.next = temp;
			ahead = ahead.next;
			sumhead = sumhead.next;
		}
		while (bhead != null) {
			s = bhead.val + carry;
			carry = 0;
			if (s > 9) {
				carry = s / 10;
				s = s % 10;
			}
			temp = new ListNode(s);
			sumhead.next = temp;
			bhead = bhead.next;
			sumhead = sumhead.next;
		}
		
		if(carry>0){
			temp = new ListNode(carry);
			carry = 0;
			sumhead.next = temp;
			sumhead = sumhead.next;
		}
		
		ListNode sumreverse = reverseList(sum);
		while(sumreverse!=null){
			if(sumreverse.val!=0){
				break;
			}else{
				sumreverse=sumreverse.next;
			}
		}
		sum = reverseList(sumreverse);
		return sum;
	}
	
	private ListNode reverseList(ListNode z) {
		if (z == null)
			return z;

		ListNode temp, node, a = z;
		temp = new ListNode(a.val);
		a = a.next;
		while (a != null) {
			node = new ListNode(a.val);
			node.next = temp;
			temp = node;
			a = a.next;
		}
		return temp;
	}
}
