package interviewbit.array;

import java.util.List;

public class Maxsum_IB_Solution {
	public int maxSubArray(final List<Integer> A) {
		int sum = Integer.MIN_VALUE;
		int last = 0;
		for (int num : A) {
			last += num;
			sum = Math.max(sum, last);
			if (last < 0)
				last = 0;
		}
		return sum;
	}
}
