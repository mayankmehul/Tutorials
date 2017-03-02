package interviewbit.math;

import java.util.ArrayList;

public class Prime_Sum {
	public ArrayList<Integer> primesum(int a) {
		ArrayList<Integer> ans = new ArrayList<Integer>();

		if (a < 4)
			return ans;

		if (a == 4) {
			ans.add(2);
			ans.add(2);
			return ans;
		}

		boolean isPrime = true;
		int last = lasgestPrimeNumber(a);
		System.out.println("last  = " + last);

		for (int n = 2; n <= a; n++) {
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime == true) {
				if ((n + last) == a) {
					ans.add(n);
					ans.add(last);
					return ans;
				} else if ((n + last) > a) {
					last = lasgestPrimeNumber(last - 1);
					System.out.println("new last = " + last);
					n = 2;
				}
			}
			isPrime = true;
		}
		return ans;
	}

	private int lasgestPrimeNumber(int a) {
		boolean isPrime = true;
		int n;
		for (n = a; n >= 2; n--) {
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime == true) {
				return n;
			}
			isPrime = true;
		}
		System.out.println("LAST PRIME = " + n);
		return n;
	}
}
