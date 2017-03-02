package interviewbit.math;

public class Greatest_Common_Divisor {
	public int gcd(int a, int b) {
		int m=0, n=0, rem=0;
		if (a == 0)
			return b;

		if (b == 0)
			return a;

		if (a == b)
			return a;

		if (a > b) {
			m = a;
			n = b;
		}

		if (a < b) {
			m = b;
			n = a;
		}

		while (m > n) {
			m = m - n;
		}

		if (m == n)
			return m;
		
		do {
			rem = m%n;
			if(rem==0){
				return n;
			}
			else{
				m=n;
				n=rem;
			}
		} while (rem>0);
		return 1;
	}
}
