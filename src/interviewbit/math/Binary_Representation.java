package interviewbit.math;

public class Binary_Representation {
	public String findDigitsInBinary(int a) {
		StringBuffer s = new StringBuffer();
		int remainder = 0;
		while (a > 1) {
			remainder = a % 2;
			s.append(remainder);
			a /= 2;
		}
		s.append(a);
		s.reverse();
		return s.toString();
	}
}
