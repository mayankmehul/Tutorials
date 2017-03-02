package interviewbit.string;

import java.util.ArrayList;

public class Zigzag_String {
	public String convert(String a, int b) {
		if(b==1||b==0){
			return a;
		}
		StringBuilder r = new StringBuilder();
		ArrayList<StringBuilder> s = new ArrayList<StringBuilder>();
		for (int i = 0; i < b; i++) {
			s.add(new StringBuilder());
		}
		int i = 0, l = 0;
		boolean direction = true;
		while (l < a.length()) {
			s.get(i).append(a.charAt(l));
			if (direction == true) {
				i++;
				if (i == s.size()) {
					i -= 2;
					direction = false;
				}
			} else {
				i--;
				if (i == -1) {
					i = 1;
					direction = true;
				}
			}
			l++;
		}
		for (i = 0; i < b; i++) {
			r.append(s.get(i));
		}
		System.out.println(s);
		return r.toString();
	}
}