package interviewbit.stackandqueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SlidingWindowMax {

	private List<Integer> l;
	private int max = 0;

	public ArrayList<Integer> slidingMaximum(final List<Integer> a, int b) {
		ArrayList<Integer> resList = new ArrayList<Integer>();
		l = a;
		max = getMaxFromList(0, b);
		resList.add(max);
		for (int i = 1; i < a.size() - b + 1; i++)
			resList.add(getMaxFromSubArray(i, i + b - 1));
		return resList;
	}

	private Integer getMaxFromSubArray(int start, int end) {
		if (l.get(end) > max)
			max = l.get(end);
		if (l.get(start - 1) == max)
			max = getMaxFromList(start, end + 1);
		return max;
	}

	private Integer getMaxFromList(int start, int end) {
		int i = start, m = Integer.MIN_VALUE;
		for(;i < end;i++)
			if (m < l.get(i))
				m = l.get(i);
		return m;
	}
}
