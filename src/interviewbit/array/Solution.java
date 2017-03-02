package interviewbit.array;

import java.util.ArrayList;

public class Solution {
	public ArrayList<Integer> rotateArray(ArrayList<Integer> A, int B) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		int b = B % A.size();
		for (int i = 0; i < b; i++) {
			int val = A.get(0);
			A.remove(0);
			A.add(val);
		}
		int i = 0;
		while (i < A.size()) {
			System.out.print(A.get(i) + "   ");
			i++;
		}
		return ret;
	}
}
