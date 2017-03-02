package interviewbit.array;

import java.util.ArrayList;

public class Array_Positive {
	public int firstMissingPositive(ArrayList<Integer> a) {
		boolean arr[] = new boolean[1000];
		boolean anyPositive = false;
		int i;
		for (i = 0; i < a.size(); i++) {
			if (a.get(i) > 0) {
				arr[a.get(i)] = true;
				anyPositive = true;
			}
		}
		if (anyPositive == true) {
			for (i = 1; i < arr.length; i++) {
				if (arr[i] == false)
					return i;
			}
		} else
			return 1;

		return 0;
	}
}
