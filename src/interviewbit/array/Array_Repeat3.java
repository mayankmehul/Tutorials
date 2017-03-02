package interviewbit.array;

import java.util.ArrayList;
import java.util.List;

public class Array_Repeat3 {
	public int repeatedNumber(final List<Integer> a) {
		List<Integer> b = new ArrayList<Integer>(a);
		if(b.size()<3)
		{
			return b.get(0);
		}
		int a1 = -1, a2 = -1, count1 = 0, count2 = 0, ans = -1;
		for (int i = 0; i < b.size(); i++) {
			if (a1 == b.get(i)) {
				count1++;
			} else {
				if (a2 == b.get(i)) {
					count2++;
				} else {
					if (a1 == -1 && count1 == 0) {
						a1 = b.get(i);
						count1++;
					} else {
						if (a2 == -1 && count2 == 0) {
							a2 = b.get(i);
							count2++;
						} else {
							count1--;
							count2--;
							if (count1 == 0 && count2 == 0) {
								b.remove(1);
								b.remove(i - 2);
								a1 = -1;
								a2 = -1;
								i = -1;
							} else {
								if (count1 == 0) {
									b.remove(i - 2);
									a1 = -1;
								}
								if (count2 == 0) {
									b.remove(i - 1);
									a2 = -1;
								}
								i -= 2;
							}
						}
					}
				}
			}
			if (b.size() > 2) {
				if (count1 > (b.size() / 3)) {
					return a1;
				}
				if (count2 > (b.size() / 3)) {
					return a2;
				}
			}
		}
		return ans;
	}
}