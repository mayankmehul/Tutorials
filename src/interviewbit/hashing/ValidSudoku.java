package interviewbit.hashing;

import java.util.HashMap;
import java.util.List;

public class ValidSudoku {
	public int isValidSudoku(final List<String> a) {
		HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
		int i = 0, j = 0, k = 1, v = 0;
		boolean flag = false;
		// int[] arrFinal={1,2,3,4,5,6,7,8,9};
		int[] test = { 1, 4, 7, 28, 31, 34, 55, 58, 61 };
		int[] arr = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		while (i < 9) {
			j = 0;
			while (j < 9) {
				if (a.get(i).charAt(j) == '.')
					v = 0;
				else
					v = Integer.parseInt(a.get(i).charAt(j) + "");
				m.put(k, v);
				k++;
				j++;
			}
			i++;
		}
		System.out.println(m);
		k = 1;
		while (k < 82) {
			System.out.println(k);
			v = m.get(k);
			if (v != 0) {
				if (arr[v] == 0) {
					arr[v] = v;
				} else
					return 0;
			}
			if (k % 9 == 0) {
				arr = new int[10];
			}
			k++;
		}
		System.out.println("ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ");
		i = 1;
		k = 1;
		while (k < 82) {
			System.out.println(k);
			v = m.get(k);
			if (v != 0) {
				if (arr[v] == 0) {
					arr[v] = v;
				} else
					return 0;
			}
			if (k + 9 > 81) {
				i++;
				if (i == 10)
					break;
				k = i;
				arr = new int[10];
			} else {
				k += 9;
			}
		}
		arr = new int[10];
		System.out.println("ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ");
		i = 0;
		k = test[i];
		j = k;
		while (k < 82) {
			System.out.print(k + "  ");
			v = m.get(k);
			if (v != 0) {
				if (arr[v] == 0) {
					arr[v] = v;
				} else
					return 0;
			}
			if (k == j + 2) {
				System.out.println();
				if (k == (test[i] + 20)) {
					System.out.println();
					i++;
					if (i == test.length)
						break;
					k = test[i];
					j = k;
					arr = new int[10];
					System.out.println("ARRAY UPDATED");
				} else {
					k += 7;
					j += 9;
				}
			} else {
				k++;
			}
		}
		return 1;
	}

	public int isValidSudoku2(final List<String> a) {
		HashMap<Integer, Integer> m;
		int i = 0, j = 0, k;
		String s;
		while (i < 9) {
			System.out.println(i);
			m = new HashMap<Integer, Integer>();
			while (j < 9) {
				s = a.get(i);
				if (s.charAt(j) == '.') {
					j++;
					continue;
				}
				k = Integer.parseInt(s.charAt(j) + "");
				if (k < 1 || k > 9)
					return 0;
				if (m.containsKey(k))
					return 0;
				else
					m.put(k, j);
				j++;
			}
			i++;
		}
		System.out.println("WTF");
		i = 0;
		j = 0;
		while (i < 9) {
			m = new HashMap<Integer, Integer>();
			while (j < 9) {
				s = a.get(j);
				if (s.charAt(i) == '.') {
					j++;
					continue;
				}
				k = Integer.parseInt(s.charAt(i) + "");
				if (k < 1 || k > 9)
					return 0;
				if (m.containsKey(k))
					return 0;
				else
					m.put(k, i);
				j++;
			}
			i++;
		}
		return 1;
	}
}
