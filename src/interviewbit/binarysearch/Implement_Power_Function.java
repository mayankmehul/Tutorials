package interviewbit.binarysearch;

public class Implement_Power_Function {
	public int pow(int x, int n, int d) {
		long s = power(x, n);
		System.out.println("s = " + s);
		long m = 0;
		if (s < 0) {
			s = -(s);
			m = s % d;
			m = d - m;
		} else {
			m = s % d;
		}
		System.out.println("m = " + m);
		return (int) m;
	}

	private long power(int a, int b) {
		if (a == 1 || b == 1)
			return a;
		if (a == 0)
			return 0;
		if (b == 0)
			return 1;
		long z = a, e = 1;
		int n = b;
		while (n > 1) {
			if (n % 2 == 0) {
				z *= z;
				n /= 2;
			} else {
				e *= z;
				n--;
			}
		}
		return (z * e);
	}
}
