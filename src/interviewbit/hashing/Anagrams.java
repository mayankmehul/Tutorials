package interviewbit.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagrams {
	public ArrayList<ArrayList<Integer>> anagrams(final List<String> a) {
		ArrayList<ArrayList<Integer>> z = new ArrayList<ArrayList<Integer>>();
		HashMap<String, ArrayList<Integer>> m = new HashMap<String, ArrayList<Integer>>();
		int i = 0;
		String s1, s2;
		while (i < a.size()) {
			s1 = a.get(i);
			char[] c = s1.toCharArray();
			Arrays.sort(c);
			s2 = new String(c);
			if (m.containsKey(s2)) {
				m.get(s2).add(i + 1);
			} else {
				ArrayList<Integer> arr = new ArrayList<Integer>();
				arr.add(i + 1);
				m.put(s2, arr);
			}
			i++;
		}
		System.out.println(m);
		for(Map.Entry<String, ArrayList<Integer>> e:m.entrySet()){
			System.out.println(e.getKey()+"\t:::\t"+e.getValue());
			z.add(e.getValue());
		}
		Collections.sort(z,new ArrayListComparator());
		System.out.println("z = " + z);
		return z;
	}
}

class ArrayListComparator implements Comparator{

	@SuppressWarnings("unchecked")
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a=(ArrayList<Integer>) o1;
		ArrayList<Integer> b=(ArrayList<Integer>) o2;
		return a.get(0).compareTo(b.get(0));
	}
}