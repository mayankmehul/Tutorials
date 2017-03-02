package interviewbit.math;

import java.util.ArrayList;

public class Prime_Numbers {
	public ArrayList<Integer> sieve(int a) {
		ArrayList<Integer> r = new ArrayList<Integer>();
		boolean isPrime = true;
		if (a == 1)
			return r;
		else {
			for (int n = 2; n <= a; n++) {
				for (int i = 2; i <= Math.sqrt(n); i++) {
					if (n % i == 0) {
						isPrime = false;
						break;
					}
				}
				if (isPrime == true) {
					r.add(n);
				}
				isPrime = true;
			}
		}
		return r;
	}
}
