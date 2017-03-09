package interviewbit.stackandqueue;

import java.util.Stack;

public class RedundantBraces {
	public int braces(String a) {
		Stack<Character> s = new Stack<Character>();
		boolean operator = false, operand = false;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == ')') {
				while (s.peek() != '(') {
					Character c = s.pop();
					if (c.equals('+') || c.equals('-') || c.equals('*')
							|| c.equals('/')) {
						operator = true;
					} else
						operand = true;
				}
				if (operand && operator) {
					s.pop();
				} else
					return 1;
				operator = false;
				operand = false;
			}
			s.push(a.charAt(i));
		}
		return 0;
	}
}
/*
 * if(a.charAt(i)=='('||a.charAt(i)==')'){ if(s.empty()) s.push(a.charAt(i));
 * if(s.peek()=='('||s.peek()==')') return 1; else s.push(a.charAt(i)); }
 * if(a.charAt
 * (i)=='+'||a.charAt(i)=='-'||a.charAt(i)=='*'||a.charAt(i)=='/')s.push
 * (a.charAt(i));
 */