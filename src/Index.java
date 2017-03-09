import interviewbit.binarysearch.Matrix_Search;
import interviewbit.hashing.Fraction;
import interviewbit.linkedlist.ListNode;
import interviewbit.string.LongestCommonPrefix;

import java.util.ArrayList;
import java.util.Arrays;

public class Index {
	public static void main(String s[]) {
		System.out.println("Running...");
		ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<4;i++){
			ArrayList<Integer> b = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25));
			a.add(b);
		}
		//ArrayList<String> a = new ArrayList<String>(Arrays.asList("abcdefgh", "aefghijk", "abcefgh"));
		//ArrayList<String> a = new ArrayList<String>(Arrays.asList("ABCD"));
		int z = new Matrix_Search().searchMatrix(a, 0);
		System.out.println("Z = " + z);
	}

	public ListNode createListNode(ArrayList<Integer> al) {
		ListNode a = null, m, n;
		if (al.size() == 0) {
			return a;
		}
		a = new ListNode(al.get(0));
		m = a;
		int i = 1;
		while (i < al.size()) {
			n = new ListNode(al.get(i));
			m.next = n;
			m = m.next;
			i++;
		}
		return a;
	}

	public ListNode mergeListNode(ListNode a, ListNode b) {
		if (a == null) {
			return b;
		}
		if (b == null) {
			return a;
		}
		ListNode aHead = a;
		while (aHead.next != null) {
			aHead = aHead.next;
		}
		aHead.next = b;
		return a;
	}

	public void printListNode(String s, ListNode a) {
		ListNode t = a;
		if (t == null) {
			System.out.println("EMPTY LISTNODE !");
			return;
		}
		System.out.print("ListNode " + s + " : ");
		while (t.next != null) {
			System.out.print(t.val + ", "); // ( " + t.next + " )
			t = t.next;
		}
		System.out.println(t.val + " ."); // (" + t.next + ")
	}
}
