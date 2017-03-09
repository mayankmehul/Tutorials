package interviewbit.hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class PointsontheStraightLine {
	public int maxPoints(ArrayList<Integer> a, ArrayList<Integer> b) {
		HashMap<String, Integer> m = new HashMap<String, Integer>();
		int i = 0, j = 0, xDiff = 0, yDiff = 0, same = 0, max = 0, curMax = 0;
		while (i < a.size()) {
			m.clear();
			same = 1;
			curMax = 0;
			j = i + 1;
			while (j < a.size()) {
				xDiff = a.get(j) - a.get(i);
				yDiff = b.get(j) - b.get(i);
				if (xDiff == 0 && yDiff == 0) {
					same++;
					j++;
					continue;
				}
				if (xDiff < 0) {
					xDiff *= -1;
					yDiff *= -1;
				}
				int g = gcd(xDiff, yDiff);
				String s = Integer.toString(xDiff/g) + ""
						+ Integer.toString(yDiff/g);
				if (m.containsKey(s)){int c=m.get(s);
					m.put(s, c+1);}
				else
					m.put(s, 1);
				curMax = Math.max(curMax, m.get(s));
				j++;
			}
			System.out.println(m);
			curMax += same;
			max = Math.max(max, curMax);
			i++;
		}
		return max;
	}

	public int gcd(int a, int b) {
		if (a == 0)
			return b;
		if (b == 0)
			return a;
		if (a < 0)
			return gcd(a * -1, b);
		if (b < 0)
			return gcd(a, b * -1);
		if (a > b)
			return gcd(b, a);
		return gcd(b % a, a);
	}
}
