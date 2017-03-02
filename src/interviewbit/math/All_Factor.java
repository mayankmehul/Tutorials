package interviewbit.math;

import java.util.ArrayList;

public class All_Factor {
	public ArrayList<Integer> allFactors(int a) {
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
