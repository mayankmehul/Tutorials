package interviewbit.stackandqueue;

import java.util.LinkedList;

public class ReverseString {
	public String reverseString(String a) {
		LinkedList<Character> l = new LinkedList<Character>();
		int i=0;
		StringBuffer s = new StringBuffer();
		while(i<a.length()){
			l.add(a.charAt(i));
			i++;
		}
		while(l.size()!=0){
			s.append(l.pollLast());
		}
		return s.toString();
	}
}
