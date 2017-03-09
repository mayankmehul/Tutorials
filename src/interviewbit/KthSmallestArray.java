package interviewbit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KthSmallestArray {

	public int findKthSmallestArray(final List<Integer> a, int k){
		List<Integer> b = a;
		Collections.sort(b);
		System.out.println(a);
		System.out.println(b);
		return b.get(k-1);
	}
}
