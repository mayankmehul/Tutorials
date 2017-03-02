package interviewbit.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Array_LargestNum {

	ArrayList<Integer> a1 = new ArrayList<Integer>();
	ArrayList<Integer> a2 = new ArrayList<Integer>();
	ArrayList<Integer> a3 = new ArrayList<Integer>();
	ArrayList<Integer> a4 = new ArrayList<Integer>();
	ArrayList<Integer> a5 = new ArrayList<Integer>();
	ArrayList<Integer> a6 = new ArrayList<Integer>();
	ArrayList<Integer> a7 = new ArrayList<Integer>();
	ArrayList<Integer> a8 = new ArrayList<Integer>();
	ArrayList<Integer> a9 = new ArrayList<Integer>();
	ArrayList<Integer> a10 = new ArrayList<Integer>();

	public String largestNumber(final List<Integer> a) {
		int i, sum;
		String str_final, s;

		for (i = 0; i < a.size(); i++) {
			String len = a.get(i).toString();
			System.out.println("lenght = " + len);
			switch (len.length()) {
			case 1:
				a1.add(a.get(i));
				break;
			case 2:
				a2.add(a.get(i));
				break;
			case 3:
				a3.add(a.get(i));
				break;
			case 4:
				a4.add(a.get(i));
				break;
			case 5:
				a5.add(a.get(i));
				break;
			case 6:
				a6.add(a.get(i));
				break;
			case 7:
				a7.add(a.get(i));
				break;
			case 8:
				a8.add(a.get(i));
				break;
			case 9:
				a9.add(a.get(i));
				break;
			case 10:
				a10.add(a.get(i));
				break;

			default:
				System.out.println("WTF IS THIS" + a.get(i));
				break;
			}
		}

		Collections.sort(a1);
		Collections.sort(a2);
		Collections.sort(a3);
		Collections.sort(a4);
		Collections.sort(a5);
		Collections.sort(a6);
		Collections.sort(a7);
		Collections.sort(a8);
		Collections.sort(a9);
		Collections.sort(a10);

		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		System.out.println(a6);
		System.out.println(a7);
		System.out.println(a8);
		System.out.println(a9);
		System.out.println(a10);

		a9 = merge(a9, a10);
		a8 = merge(a8, a9);
		a7 = merge(a7, a8);
		a6 = merge(a6, a7);
		a5 = merge(a5, a6);
		a4 = merge(a4, a5);
		a3 = merge(a3, a4);
		a2 = merge(a2, a3);
		a1 = merge(a1, a2);

		System.out.println("Last Array ::: " + a1);
		str_final = a1.get(a1.size() - 1).toString();
		sum = a1.get(a1.size() - 1);
		for (i = a1.size() - 2; i >= 0; i--) {
			sum += a.get(i);
			s = a1.get(i).toString();
			str_final = str_final + s;
		}
		if (sum <= 0) {
			return "0";
		}
		return str_final;
	}

	public ArrayList<Integer> merge(ArrayList<Integer> m, ArrayList<Integer> n) {
		ArrayList<Integer> x = new ArrayList<Integer>();
		if (m.isEmpty() && n.isEmpty()) {
			return x;
		}

		int i = m.size() - 1, j = n.size() - 1;
		String s1, s2;

		while (i >= 0 && j >= 0) {

			s1 = m.get(i).toString();
			s2 = n.get(j).toString();

			String s = myComapre(s1, s2);
			if (s == s1) {
				x.add(0, m.get(i));
				m.remove(i);
				i--;
			} else {
				x.add(0, n.get(j));
				n.remove(j);
				j--;
			}
		}
		if (i < 0 && j >= 0) {
			while (j >= 0) {
				x.add(0, n.get(j));
				n.remove(j);
				j--;
			}
		}
		if (j < 0 && i >= 0) {
			while (i >= 0) {
				x.add(0, m.get(i));
				m.remove(i);
				i--;
			}
		}
		return x;
	}

	public String myComapre(String s1, String s2) {
		long x = Long.parseLong(s1.concat(s2));
		long y = Long.parseLong(s2.concat(s1));
		// System.out.println("x = " + x + "\t y = " + y);
		if (x > y) {
			return s1;
		} else {
			return s2;
		}
	}
}
