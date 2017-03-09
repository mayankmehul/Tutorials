package interviewbit.hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class LargestContinuousSequenceZeroSum {

	public ArrayList<Integer> lszero(ArrayList<Integer> a) {
		HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
		// HashMap<Integer, Integer> key = new HashMap<Integer, Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		int i = 0, sum = 0, l = 0, key = 0;
		boolean dec = false;
		while (i < a.size()) {
			sum += a.get(i);
			System.out.println("i = " + i + "\t\ta[" + i + "] = " + a.get(i)
					+ "\t\tsum = " + sum + "\t\tl = " + l);
			if (a.get(i) == 0 && l == 0) {
				l = 1;
				key = sum;
			}
			if (sum == 0) {
				l = i + 1;
				key = a.get(0);
				dec = true;
			}
			if (m.containsKey(sum)) {
				System.out.println(i);
				System.out.println(a.get(i));
				if (i - m.get(sum) > l) {
					key = sum;
					dec = false;
				}
				l = Math.max(l, i - m.get(sum));

			} else
				m.put(sum, i);
			i++;
		}
		System.out.println(m);
		System.out.println("i = " + i + "\t\tl = " + l + "\t\tkey = " + key);
		if (sum == 0)
			return a;
		if (l == 0)
			return b;
		i = m.get(key) + 1;
		if(dec)i--;
		while (l > 0) {
			System.out.println(i);
			b.add(a.get(i));
			i++;
			l--;
		}
		return b;
	}
}
