package interviewbit.linkedlist;

public class RotateList {
	public ListNode rotateRight(ListNode a, int b) {
		if (a == null)
			return a;
		int len = 1;
		ListNode last = a, p = a;
		while (last.next != null) {
			last = last.next;
			len++;
		}
		b = b % len;
		if (b == 0)
			return a;
		else {
			last.next=a;
			b = len-b;
			while(p!=null||b>0){
				if(b==1){
					a=p.next;
					p.next=null;
					break;
				}else{
					p=p.next;
					b--;
				}
			}
		}
		return a;
	}
}
