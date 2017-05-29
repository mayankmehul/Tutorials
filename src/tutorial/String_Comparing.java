package tutorial;

import java.util.Scanner;

public class String_Comparing {
	public void string_Editability() {
		String s1, s2;
		char[] c1, c2;
		boolean diff = false;
		int diff_count = 0, l = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first string : ");
		s1 = sc.next();
		System.out.println("Enter your second string : ");
		s2 = sc.next();
		sc.close();
		c1 = new char[s1.length()];
		c2 = new char[s2.length()];
		for (int i = 0; i < s1.length(); i++) {
			c1[i] = s1.charAt(i);
		}
		for (int i = 0; i < s2.length(); i++) {
			c2[i] = s2.charAt(i);
		}

		if (s1.length() == s2.length()) {
			for (int i = 0; i < s1.length(); i++) {
				if (c1[i] != c2[i]) {
					diff = true;
					diff_count++;
				}
			}
		} else {
			diff = true;
			if (s1.length() < s2.length()) {
				l = s1.length();
				diff_count = s2.length()-l;
			} else {
				l = s2.length();
				diff_count = s1.length()-l;
			}
			//diff_count++;
			for (int i = 0; i < l; i++) {
				if (c1[i] != c2[i]) {
					diff_count++;
				}
			}
		}
		if (diff == true || diff_count > 1) {
			System.out.println("Editable : Yes");
			System.out.println("No. of Edit = " + diff_count);
		}
		else
		{
			System.out.println("Both the strings are identical.");
		}
		//System.out.println(c1);
		//System.out.println(c2);
	}
}
