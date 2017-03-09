package interviewbit.stackandqueue;

import java.util.ArrayList;

public class GenerateAllParentheses {
	public int isValid(String a) {
		ArrayList<Character> s = new ArrayList<Character>();
		Character c;
		int i = 0;
		while (i < a.length()) {
			c = a.charAt(i);
			if (c == '[' || c == '{' || c == '(') {
				s.add(c);
			} else {
				if (c == ']' || c == '}' || c == ')') {
					if(s.isEmpty())return 0;
					Character d = s.get(s.size() - 1);
					if (c == ']') {
						if (d == '[')
							s.remove(s.size() - 1);
						else
							return 0;
					}
					if (c == '}') {
						if (d == '{')
							s.remove(s.size() - 1);
						else
							return 0;
					}
					if (c == ')') {
						if (d == '(')
							s.remove(s.size() - 1);
						else
							return 0;
					}
				}
			}
			i++;
		}
		if (!s.isEmpty())
			return 0;
		return 1;
	}
}
