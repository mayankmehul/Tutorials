package interviewbit.binarysearch;

import java.util.*;

public class Matrix_Search {
	public int searchMatrix(ArrayList<ArrayList<Integer>> a, int x) {
		int start = 0, end = a.size() - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if ((a.get(mid).get(0) <= x)
					&& (a.get(mid).get(a.get(0).size() - 1) >= x)) {
				System.out.println("Array Line Found");
				int m = binarySearch(a.get(mid), a.get(mid).size(), x);
				if (m == 1)
					return 1;
				else
					return 0;
			} else {
				if (a.get(mid).get(0) > x)
					end = mid - 1;
				else
					start = mid + 1;
			}
		}
		return 0;
	}

	private int binarySearch(ArrayList<Integer> a, int size, int x) {
		int start = 0, end = size, mid = 0;
		while (start <= end) {
			mid = start + (end - start) / 2;
			if (a.get(mid) == x) {
				return 1;
			} else {
				if (a.get(mid) > x)
					end = mid - 1;
				else
					start = mid + 1;
			}
		}
		return -1;
	}
}
