package interviewbit.array;

import java.util.ArrayList;

public class Array_Plus1 {
	public ArrayList<Integer> plusOne(ArrayList<Integer> a) {
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) == 0) {
				if (a.size() == 1) {
					break;
				} else {
					a.remove(i);
					i--;
				}
			} else {
				break;
			}
		}
		if (a.get(a.size() - 1) != 9) {
			a.set(a.size() - 1, a.get(a.size() - 1) + 1);
			return a;
		} else {
			a = inc_of_9(a);
		}
		return a;
	}

	private ArrayList<Integer> inc_of_9(ArrayList<Integer> a) {
		for (int i = a.size() - 1; i >= 0; i--) {
			if (i == 0) {
				if (a.get(i) != 9) {
					a.set(i, a.get(i) + 1);
					return a;
				} else {
					a.set(i, 0);
					a.add(0, 1);
					return a;
				}
			} else {
				if (a.get(i - 1) != 9) {
					a.set(i, 0);
					a.set(i - 1, a.get(i - 1) + 1);
					return a;
				} else {
					a.set(i, 0);
				}
			}
		}
		return a;
	}
}