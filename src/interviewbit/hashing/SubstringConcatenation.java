package interviewbit.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SubstringConcatenation {
	public ArrayList<Integer> findSubstring(String a, final List<String> b) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		int i = 0, l = (b.get(0).length() * b.size()), sumOfHash = 0;
		for (i = 0; i < b.size(); i++)
			sumOfHash += b.get(i).hashCode();
		for (i = 0; i <= (a.length() - l); i++) {
			if (isHashEqual(a.substring(i, i + l), b.get(0).length(), sumOfHash)) {
				if (compareString(a.substring(i, i+l), new ArrayList<String>(b), l))
					res.add(i);
			}
		}
		return res;
	}

	private boolean isHashEqual(String s, int l, int hashCode) {
		int i = 0, myHashCode = 0;
		for (i = 0; i <= s.length() - l; i += l)
			myHashCode += s.substring(i, i + l).hashCode();
		if (myHashCode != hashCode)
			return false;
		return true;
	}

	private boolean compareString(String a, ArrayList<String> b, int l) {
		int i = 0;
		while (i < b.size()) {
			if (a.contains(b.get(i))) {
				a=a.replaceFirst(b.get(i), "");
				b.remove(i);
				i--;
			}
			i++;
		}
		if (a.equals("") && b.size() == 0)
			return true;
		return false;
	}

	public ArrayList<Integer> findSubstring2(String a, final List<String> b) {
		int i = 0, k = 0;
		HashMap<String, Integer> m = new HashMap<String, Integer>();
		HashMap<String, Integer> m2 = new HashMap<String, Integer>();
		ArrayList<Integer> res = new ArrayList<Integer>();
		for (int x = 0; x < b.size(); x++)
			m.put(b.get(x), 0);
		while (i < b.size()) {
			k = 0;
			while (k < a.length() - (b.get(0).length() * b.size())) {
				if (a.substring(k).contains(b.get(i))) {
					k = a.indexOf(b.get(i), k);
					m2 = new HashMap<String, Integer>(m);
					m2.remove(b.get(i));
					boolean flag = checkForSubstrings(a, m2, b.get(0).length(),
							k);
					if (flag)
						res.add(k);
				}
				k++;
			}
			i++;
		}
		return res;
	}

	private boolean checkForSubstrings(String a, HashMap<String, Integer> b,
			int lenght, int k) {
		int i = 0;
		k += lenght;
		if (k + lenght >= a.length())
			return false;
		while (b.size() > 0) {
			i = 0;
			while (i <= b.size()) {
				if (i == b.size())
					return false;
				if (k + lenght >= a.length())
					break;
				if (b.containsKey(a.substring(k, k + lenght))) {
					b.remove(a.substring(k, k + lenght));
					k += lenght;
					break;
				}
				i++;
			}
		}
		return true;
	}

	private void stringCombinations(List<String> a, String prefix) {
		if (a.size() == 0) {
			// m.put(i, prefix);
			// i++;
			return;
		}
		int i = 0;
		while (i < a.size()) {
			String newPrefix = prefix + a.get(i);
			List<String> b = new ArrayList<String>(a);
			b.remove(i);
			stringCombinations(b, newPrefix);
			i++;
		}
	}
}
