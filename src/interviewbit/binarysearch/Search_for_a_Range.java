package interviewbit.binarysearch;

import java.util.ArrayList;
import java.util.List;

public class Search_for_a_Range {
	public ArrayList<Integer> searchRange(final List<Integer> a, int b) {
		ArrayList<Integer> r = new ArrayList<Integer>();
		int index = binarySearch(a, a.size() - 1, b);
		System.out.println("index = " + index);
		if (index == -1) {
			r.add(-1);
			r.add(-1);
			return r;
		}

		int start = searchLeftIndex(a, 0, index, b);
		System.out.println("strat = " + start);
		int end = searchRightIndex(a, a.size() - 1, index, b);
		System.out.println("end = " + end);
		r.add(start);
		r.add(end);
		return r;
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

	private int searchLeftIndex(List<Integer> a, int s, int index, int x) {
		int start = s, end = index;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (a.get(mid) == x) {
				if (mid == 0)
					return mid;
				if (mid > 0 && a.get(mid - 1) < x) {
					return mid;
				} else {
					end = mid - 1;
				}
			} else {
				start = mid + 1;
			}
		}
		return index;
	}

	private int searchRightIndex(List<Integer> a, int e, int index, int x) {
		int start = index, end = e;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (a.get(mid) == x) {
				if (mid == a.size() - 1)
					return mid;
				if (a.get(mid + 1) > x) {
					return mid;
				} else {
					start = mid + 1;
				}
			} else {
				end = mid - 1;
			}
		}
		return index;
	}
}
