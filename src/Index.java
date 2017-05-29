import interviewbit.array.NobleInteger;
import interviewbit.binarysearch.Matrix_Search;
import interviewbit.hashing.Fraction;
import interviewbit.linkedlist.ListNode;
import interviewbit.string.LongestCommonPrefix;

import java.util.ArrayList;
import java.util.Arrays;

public class Index {
	public static void main(String s[]) {
		System.out.println("Running...");
		ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(-4, 7, 5, 3, 5, -4, 2, -1, -9, -8, -3, 0, 9, -7, -4, -10, -4, 2, 6, 1, -2, -3, -1, -8, 0, -8, -7, -3, 5, -1, -8, -8, 8, -1, -3, 3, 6, 1, -8, -1, 3, -9, 9, -6, 7, 8, -6, 5, 0, 3, -4, 1, -10, 6, 3, -8, 0, 6, -9, -5, -5, -6, -3, 6, -5, -4, -1, 3, 7, -6, 5, -8, -5, 4, -3, 4, -6, -7, 0, -3, -2, 6, 8, -2, -6, -7, 1, 4, 9, 2, -10, 6, -2, 9, 2, -4, -4, 4, 9, 5, 0, 4, 8, -3, -9, 7, -8, 7, 2, 2, 6, -9, -10, -4, -9, -5, -1, -6, 9, -10, -1, 1, 7, 7, 1, -9, 5, -1, -3, -3, 6, 7, 3, -4, -5, -4, -7, 9, -6, -2, 1, 2, -1, -7, 9, 0, -2, -2, 5, -10, -1, 6, -7, 8, -5, -4, 1, -9, 5, 9, -2, -6, -2, -9, 0, 3, -10, 4, -6, -6, 4, -3, 6, -7, 1, -3, -5, 9, 6, 2, 1, 7, -2, 5));
		//ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(-4, -2, 0, -1, -6));
		//ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(8,4,4,7,5,2,0,2,5,0));
		int z = new NobleInteger().solve(a);
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
