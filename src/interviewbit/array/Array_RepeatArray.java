package interviewbit.array;

import java.util.List;

public class Array_RepeatArray {
	public int repeatedNumber(final List<Integer> a) {
		int ans = 0;
		int[] b = new int[a.size()];
		for (int i = 0; i < a.size(); i++) {
			b[a.get(i)] += 1;
		}
		
		for (int i = 1; i < b.length; i++) {
			System.out.println(b[i] + "  ");
		}
		
		
		for (int i = 1; i < b.length; i++) {
			if (b[i] == 2) {
				return i;
			}
		}

		return ans;
	}
}
