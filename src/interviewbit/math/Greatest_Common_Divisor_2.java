package interviewbit.math;

import java.util.ArrayList;

public class Greatest_Common_Divisor_2 {
	public int gcd(int a, int b) {
		int count = 0, m = 0, n = 0;
		if (a == 0)
			return b;

		if (b == 0)
			return a;

		if (a == b)
			return a;

		if (a > b) {
			m = a;
			n = b;
		}

		if (a < b) {
			m = b;
			n = a;
		}

		while (m > n)
			m = m - n;

		if (m == n)
			return m;

		ArrayList<Integer> a_f = allFactors(n);
		ArrayList<Integer> b_f = allFactors(m);
		System.out.println("m = " + m);
		System.out.println("n = " + n);
		System.out.println("a f = " + a_f);
		System.out.println("b f = " + b_f);
		for (int i = a_f.size() - 1; i >= 0; i--) {
			for (int j = b_f.size() - 1; j >= 0; j--) {
				count++;
				if (a_f.get(i) > b_f.get(j))
					break;
				if (a_f.get(i) == b_f.get(j)) {
					System.out.println("count = " + count);
					return a_f.get(i);
				}
			}
		}
		System.out.println("count = " + count);
		return 1;
	}

	private ArrayList<Integer> allFactors(int a) {
		ArrayList<Integer> r = new ArrayList<Integer>();
		if (a == 0) {
			r.add(0);
			return r;
		}
		if (a == 1) {
			r.add(1);
			return r;
		}
		int index = 1;
		r.add(1);
		r.add(a);
		for (int i = 2; i <= Math.sqrt(a); i++) {
			if (a % i == 0) {
				r.add(index, i);
				if (i != (a / i))
					r.add(index + 1, a / i);
				index++;
			}
		}
		return r;
	}
}