package interviewbit.array;

import java.util.ArrayList;
import java.util.List;

public class Array_NArray {
	public ArrayList<Integer> repeatedNumber(final List<Integer> a) {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		int[] b = new int[a.size() + 1];
		for (int i = 0; i < a.size(); i++) {
			b[a.get(i)] += 1;
		}
		for (int i = 1; i < b.length; i++) {
			if (b[i] == 0) {
				if (ans.isEmpty())
					ans.add(i);
				else
					ans.add(1, i);

			}
			if (b[i] == 2) {
				if (ans.isEmpty())
					ans.add(i);
				else
					ans.add(0, i);
			}
		}

		return ans;
	}
}
