package interviewbit.binarysearch;

import java.util.ArrayList;
import java.util.List;

public class Median_Of_Array {
	public double findMedianSortedArrays(final List<Integer> a,
			final List<Integer> b) {
		double r = 0;
		ArrayList<Integer> z = mergeSortArray(a, b);
		if (z.size() % 2 == 0) {
			double m = z.get(z.size() / 2);
			double n = z.get((z.size() - 1) / 2);
			r = (m + n) / 2;
		} else {
			r = z.get(z.size() / 2);
		}
		return r;
	}

	private ArrayList<Integer> mergeSortArray(List<Integer> a, List<Integer> b) {
		ArrayList<Integer> z = new ArrayList<Integer>();
		if (a.size() == 0) {
			// z = (ArrayList<Integer>) b;
			z.addAll(b);
			return z;
		}
		if (b.size() == 0) {
			// z = (ArrayList<Integer>) a;
			z.addAll(a);
			return z;
		}
		int i = 0, j = 0, k = 0;
		while (i < a.size() && j < b.size()) {
			if (a.get(i) > b.get(j)) {
				// z.set(k, b.get(j));
				z.add(b.get(j));
				j++;
			} else {
				z.add(a.get(i));
				// z.set(k, a.get(i));
				i++;
			}
			k++;
		}
		while (i < a.size()) {
			z.add(a.get(i));
			// z.set(k, a.get(i));
			i++;
			k++;
		}
		while (j < b.size()) {
			z.add(b.get(j));
			// z.set(k, b.get(j));
			j++;
			k++;
		}
		return z;
	}
}
