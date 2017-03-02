package interviewbit.binarysearch;

import java.util.List;

public class Count_Element_Occurence {
	public int findCount(final List<Integer> a, int b) {
		int index = binarySearch(a, a.size() - 1, b);
		if (index == -1) {
			return 0;
		}
		System.out.println(index);
		int count = 0;
		count = checkLeft(a, index - 1, b) + checkRight(a, index + 1, b) + 1;
		return count;
	}

	private int binarySearch(List<Integer> a, int size, int x) {
		int start = 0, end = size, mid = 0;
		while (start <= end) {
			mid = start + (end - start) / 2;
			if (a.get(mid) == x) {
				return mid;
			} else {
				if (a.get(mid) > x)
					end = mid - 1;
				else
					start = mid + 1;
			}
		}
		return -1;
	}

	private int checkLeft(List<Integer> a, int i, int x) {
		int c = 0;
		while (i > -1 && a.get(i) == x) {
			c++;
			i--;
		}
		return c;
	}

	private int checkRight(List<Integer> a, int i, int x) {
		int c = 0;
		while (i < a.size() && a.get(i) == x) {
			c++;
			i++;
		}
		return c;
	}
}
