package interviewbit.math;

public class Reverse_Integer {
	public int reverse(int a) {
		boolean sign = false;
		if (a < 0) {
			sign = true;
			a = -(a);
		}
		long b = 0;
		System.out.println(a);
		while (a >= 10) {
			b = (b * 10) + (a % 10);
			a /= 10;
			System.out.println("b = " + b);
			System.out.println("a = " + a);
		}
		b = (b * 10) + (a);

		System.out.println("LAST b = " + b);
		if (b > Integer.MAX_VALUE) {
			return 0;
		}
		if (sign == true) {
			b = -(b);
		}
		return (int) b;
	}
}
