package interviewbit.math;

public class Excel_Column_Title {
	public String convertToTitle(int a) {
		int n = a, div = 0, quot = 0, rem = 0;
		char ch;
		StringBuffer s = new StringBuffer();
		for (int i = 5; i > 0; i--) {
			div = (int) Math.pow(26, i);
			
			int d_limit = getDivisor(i);
			
			if (n > d_limit) {
				quot = n / div;
				rem = n % div;
				if (rem == 0)
					quot--;
				ch = getNumberValue(quot);
				s.append(ch);
				n = rem;
			}
		}
		s.append(getNumberValue(a % 26));
		return s.toString();
	}

	private char getNumberValue(int m) {
		System.out.println("m = " + m);
		if (m == 0)
			return 'Z';
		char c = (char) (m + 64);
		System.out.println("c = " + c);
		return c;
	}
	
	private int getDivisor(int i) {
		int d = 0;
		while(i>0)
		{
			d+=Math.pow(26, i);
			i--;
		}
		return d;
	}
}
