package interviewbit.binarysearch;

import java.util.List;

public class Median_Of_Array_GFG {
	public double findMedianSortedArrays(final List<Integer> a,
			final List<Integer> b) {
		double d = 0;
		if (a.size() <= b.size()) {
			d = findMedianUtil(a, b);
		} else {
			d = findMedianUtil(b, a);
		}
		return d;
	}

	private double findMedianUtil(List<Integer> a, List<Integer> b) {
		if (a.size() == 0) {
			return medianSingle(b);
		}
		if (a.size() == 1) {
			if (b.size() == 1) {
				return mo2(a.get(0), b.get(0));
			}
			if (b.size() % 2 == 0) {
				return mo3(a.get(0), b.get(b.size() / 2), b
						.get((b.size() / 2) - 1));
			}
			return mo4(a.get(0), b.get((b.size() / 2) - 1),
					b.get(b.size() / 2), b.get((b.size() / 2) + 1));
		} else {
			if (a.size() == 2) {
				if (b.size() == 2) {
					return mo4(a.get(0), a.get(1), b.get(0), b.get(1));
				}
				if (b.size() % 2 == 0) {
					return mo4(Math.max(a.get(0), b.get((b.size() / 2) - 2)),
							Math.min(a.get(1), b.get((b.size() / 2) + 1)), b
									.get(b.size() / 2), b
									.get((b.size() / 2) - 1));
				}
				return mo3(b.get(b.size() / 2), Math.max(a.get(0), b.get((b
						.size() / 2) - 1)), Math.min(a.get(1), b
						.get((b.size() / 2) + 1)));
			}
		}
		int i_a = a.size() / 2;
		int i_b = b.size() / 2;
		if (a.get(i_a) <= b.get(i_b)) {
			a = a.subList(i_a, a.size());
			b = b.subList(0, b.size() - i_a);
			return findMedianUtil(a, b);
		} else {
			//a = a.subList(0, i_a);
			a = a.subList(0, (a.size()+1)/2);
			b = b.subList(i_a, b.size());
			return findMedianUtil(a, b);
		}
	}

	private double medianSingle(List<Integer> a) {
		if (a.size() == 0) {
			return -1;
		}
		if (a.size() % 2 == 0) {
			return ((a.get(a.size() / 2) + a.get((a.size() - 1) / 2)) / 2.0);
		}
		return (a.get(a.size() / 2));
	}

	private double mo2(int p, int q) {
		return (p + q) / 2.0;
	}

	private double mo3(int p, int q, int r) {
		return (p + q + r - (Math.min(p, Math.min(q, r))) - (Math.max(p, Math
				.max(q, r))));
	}

	private double mo4(int p, int q, int r, int s) {
		int max = Math.max(p, Math.max(q, Math.max(r, s)));
		int min = Math.min(p, Math.min(q, Math.min(r, s)));
		return ((p + q + r + s - max - min) / 2.0);
	}
}