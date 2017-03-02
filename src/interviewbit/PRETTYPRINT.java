package interviewbit;

import java.util.ArrayList;

public class PRETTYPRINT {
	public ArrayList<ArrayList<Integer>> prettyPrint(int a) {
		ArrayList<ArrayList<Integer>> m = new ArrayList<ArrayList<Integer>>();
		int i = 0, j = 0, s = ((2 * a) - 1), s_inc = 0;

		for (i = 0; i < s; i++) {
			m.add(new ArrayList<Integer>());
		}
		while (s_inc < ((s + 1) / 2)) {
			for (i = s_inc, j = s_inc; i < s - s_inc;) {
				if (i == s_inc || i == ((s - s_inc) - 1)) {
					m.get(i).add(s_inc, a);
					j++;
					if (j == (s - s_inc)) {
						j = s_inc;
						i++;
					}
				} else {
					if (j == 0) {
						m.get(i).add(a);
						m.get(i).add(a);
					} else {
						if (j == (Math.floor(s / 2))) {
							m.get(i).add(s_inc, a);
						} else {
							m.get(i).add(s_inc, a);
							m.get(i).add(s_inc, a);
						}
					}
					i++;
				}
			}
			a--;
			s_inc++;
		}

		for (j = 0; j < m.size(); j++) {
			System.out.println(m.get(j));
		}
		System.out.println("Working Properly...");
		return m;
	}
}
