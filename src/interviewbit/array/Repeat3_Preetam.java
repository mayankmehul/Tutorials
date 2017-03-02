package interviewbit.array;

import java.util.HashMap;
import java.util.List;

public class Repeat3_Preetam {
	public int repeatedNumber(final List<Integer> a) {
		int size = a.size() / 3;
		HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
		for (Integer i : a) {
			if (!h.containsKey(i)) {
				h.put(i, 1);
				if ((h.get(i)) > size)
					return i;
			} else {
				if ((h.get(i) + 1) > size)
					return i;
				else
					h.put(i, h.get(i) + 1);
			}
		}
		return -1;
	}
}
