package interviewbit.hashing;

import java.util.HashMap;

public class Fraction {
	public String fractionToDecimal(int numerator, int denominator) {
		long r;
		int i = 0;
		StringBuilder q = new StringBuilder();
		HashMap<Long, Integer> m = new HashMap<Long, Integer>();
		q.append(numerator / denominator);
		r = numerator % denominator;
		if (r == 0)
			return q.toString();
		q.append(".");
		m.put(r, i);
		while (r != 0) {
			i++;
			r *= 10;
			q = q.append(r / denominator);
			r %= denominator;
			if (m.containsKey(r)) {
				System.out.println(r + "\t\t" + m.get(r) + "\t\t" + i + "\t\t" + q.charAt(i));
				System.out.println("i = " + m.get(r));
				i = m.get(r) + q.indexOf(".") + 1;
				q.insert(i, '(');
				q.append(")");
				break;
			}
			m.put(r, i);
		}
		i = q.indexOf("-");
		if (i > 0) {
			q.replace(i, i + 1, "");
			q = q.insert(0, '-');
		}
		return q.toString();
	}
}