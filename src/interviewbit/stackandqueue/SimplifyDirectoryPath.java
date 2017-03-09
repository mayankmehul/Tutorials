package interviewbit.stackandqueue;

import java.util.Iterator;
import java.util.LinkedList;

public class SimplifyDirectoryPath {
	public String simplifyPath(String a) {
		LinkedList<Character> s = new LinkedList<Character>();
		StringBuffer r = new StringBuffer();
		s.add('/');
		int i = 0, count = 0;
		Character c, top;
		while (i < a.length()) {
			c = a.charAt(i);
			top = s.get(s.size() - 1);
			if (c == '/' && top == '/') {
				s.pollLast();
			} else {
				if (top.equals('.')) {
					count++;
					if (count == 1 && c.equals('/')) {
						s.pollLast();
						s.pollLast();
						count = 0;
					}
					if (count == 2 && c.equals('/')) {
						do {
							s.pollLast();
							if (s.isEmpty())
								s.add('/');
						} while (s.get(s.size() - 1) != '/');
						do {
							s.pollLast();
							if (s.isEmpty())
								s.add('/');
						} while (s.get(s.size() - 1) != '/');
						s.pollLast();
						count = 0;
					}
				}
			}
			s.add(c);
			i++;
			printList(s);
		}
		System.out.println("Count = " + count);
		if (count == 0 && s.get(s.size()-1) == '.') {
			s.pollLast();
		}
		if (count == 1 && s.get(s.size()-1) == '.') {
			do {
				s.pollLast();
				if (s.isEmpty())
					s.add('/');
			} while (s.get(s.size() - 1) != '/');
			do {
				s.pollLast();
				if (s.isEmpty())
					s.add('/');
			} while (s.get(s.size() - 1) != '/');
			s.pollLast();
		}
		if (s.isEmpty() || (s.size() == 1 && s.get(s.size()-1) == '/'))
			return "/";
		while (!s.isEmpty()) {
			r.append(s.poll());
		}
		if (r.charAt(r.length() - 1) == '/') {
			r.replace(r.length() - 1, r.length(), "");
		}
		return r.toString();
	}

	private void printList(LinkedList<Character> s) {
		int i = 0;
		while (i < s.size()) {
			System.out.print(s.get(i) + " ");
			i++;
		}
		System.out.println();
	}
}
