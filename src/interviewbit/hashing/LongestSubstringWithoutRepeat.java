package interviewbit.hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class LongestSubstringWithoutRepeat {
	public int lengthOfLongestSubstring(String a) {
		if (a.length() == 0)
			return 0;
		HashMap<Character, Integer> m = new HashMap<Character, Integer>();
		ArrayList<Integer> l = new ArrayList<Integer>();
		int i = 0, counter = 0;
		while (i < a.length()) {
			if (!m.containsKey(a.charAt(i))
					|| (i - counter > m.get(a.charAt(i)))) {
				counter++;
			} else {
				l.add(counter);
				counter = i - m.get(a.charAt(i));
			}
			m.put(a.charAt(i), i);
			i++;
		}
		l.add(counter);
		Collections.sort(l);
		return l.get(l.size() - 1);
	}
}
