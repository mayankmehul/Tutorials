package interviewbit.binarysearch;

public class Implement_Power_Function_2 {
	public int pow(int x, int n, int d) {
		if (d == 1)
			return 0;
		if (x == 1)
			return 1;
		if (x == 0)
			return 0;
		if (n == 0)
			return 1;
		long r = x % d, e = 1;
		while (n > 1) {
			if (n % 2 == 0) {
				r *= r;
				if (r > d) {
					r %= d;
				}
				n /= 2;
			} else {
				e *= r;
				if (e > d) {
					e %= d;
				}
				n--;
			}
		}
		r *= e;
		r %= d;
		System.out.println("r = " + r);
		if (r < 0) {
			r += d;
		}
		return (int) r;
	}
}