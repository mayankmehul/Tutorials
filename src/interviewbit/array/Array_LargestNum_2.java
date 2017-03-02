package interviewbit.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Array_LargestNum_2 {

	public String largestNumber(final List<Integer> a) {
		
		if (a == null || a.size() == 0)
			return "";
		String[] temp = new String[a.size()];
		for (int i = 0; i < a.size(); i++) {
			temp[i] = String.valueOf(a.get(i));
		}
		Comparator<String> myComparator = new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				String sa = a + b;
				String sb = b + a;
				return sb.compareTo(sa);
			}
		};
		Arrays.sort(temp, myComparator);
		if (temp[0].equals("0"))
			return "0";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < temp.length; i++) {
			sb.append(temp[i]);
		}
		return sb.toString();
	}
}