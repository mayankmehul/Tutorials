package interviewbit.binarysearch;

import java.util.List;

public class Rotated_Array {
	public int findMin(final List<Integer> a) {
		for (int i = 0; i < a.size() - 1; i++) {
			if (a.get(i) > a.get(i + 1)) {
				return a.get(i+1);
			}
		}
		return a.get(0);
	}
}
