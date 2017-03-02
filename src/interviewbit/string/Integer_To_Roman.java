package interviewbit.string;

public class Integer_To_Roman {
	public String intToRoman(int n) {
		if (n == 0)
			return "0";
		StringBuilder s = new StringBuilder();
		while (n > 0) {
			if (n >= 1000) {
				s = s.append("M");
				n -= 1000;
			} else {
				if (n >= 100) {
					s = s.append("C");
					n -= 100;
				} else {
					if (n >= 10) {
						s = s.append("X");
						n -= 10;
					} else {
						if (n >= 1) {
							s = s.append("I");
							n -= 1;
						}
					}
				}
			}
		}
		s = checkFor9(s);
		s = checkFor5(s);
		s = checkFor4(s);
		return s.toString();
	}

	private StringBuilder checkFor9(StringBuilder s) {
		int i = 0, count = 0, start = 0;
		char c = s.charAt(0);
		while (i < s.length()) {
			if (c == s.charAt(i)) {
				count++;
				if (count == 9) {
					s = convert_9to1(s, start, i, c);
					i=0;
					c = s.charAt(0);
				}
			} else {
				c=s.charAt(i);
				count = 1;
				start = i;
			}
			i++;
		}
		return s;
	}

	private StringBuilder convert_9to1(StringBuilder s, int start, int end,
			char c) {
		if (c == 'C') {
			s = s.replace(start, end + 1, "CM");
		} else {
			if (c == 'X') {
				s = s.replace(start, end + 1, "XC");
			} else {
				if (c == 'I') {
					s = s.replace(start, end + 1, "IX");
				}
			}
		}
		return s;
	}
	
	private StringBuilder checkFor5(StringBuilder s) {
		int i = 0, count = 0, start = 0;
		char c = s.charAt(0);
		while (i < s.length()) {
			if (c == s.charAt(i)) {
				count++;
				if (count == 5) {
					s = convert_5to1(s, start, i, c);
					i=0;
					c = s.charAt(0);
				}
			} else {
				c=s.charAt(i);
				count = 1;
				start = i;
			}
			i++;
		}
		return s;
	}
	
	private StringBuilder convert_5to1(StringBuilder s, int start, int end,
			char c) {
		if (c == 'C') {
			s = s.replace(start, end + 1, "D");
		} else {
			if (c == 'X') {
				s = s.replace(start, end + 1, "L");
			} else {
				if (c == 'I') {
					s = s.replace(start, end + 1, "V");
				}
			}
		}
		return s;
	}
	
	private StringBuilder checkFor4(StringBuilder s) {
		int i = 0, count = 0, start = 0;
		char c = s.charAt(0);
		while (i < s.length()) {
			if (c == s.charAt(i)) {
				count++;
				if (count == 4) {
					s = convert_4to1(s, start, i, c);
					i=0;
					c = s.charAt(0);
				}
			} else {
				c=s.charAt(i);
				count = 1;
				start = i;
			}
			i++;
		}
		return s;
	}
	
	private StringBuilder convert_4to1(StringBuilder s, int start, int end,
			char c) {
		if (c == 'C') {
			s = s.replace(start, end + 1, "CD");
		} else {
			if (c == 'X') {
				s = s.replace(start, end + 1, "XL");
			} else {
				if (c == 'I') {
					s = s.replace(start, end + 1, "IV");
				}
			}
		}
		return s;
	}
}