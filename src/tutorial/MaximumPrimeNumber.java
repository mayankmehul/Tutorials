package tutorial;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumPrimeNumber {

	private boolean prime[];
	int maxPrime = 0;

	public static void main(String[] args) {
		System.out.print("Enter the end number of the range ::: ");
		int n = new Scanner(System.in).nextInt();
		System.out.println("x = " + new MaximumPrimeNumber().getMaxPrime(n));
	}

	private int getMaxPrime(int n) {
		if(n<2)	return 0;
		prime = new boolean[n + 1];
		Arrays.fill(prime, true);
		updateNonPrimeNumbers(n);
		return maxPrime;
	}

	private void updateNonPrimeNumbers(int n) {
		for (int i = 2; i <= n; i++)
			if (prime[i]) {
				maxPrime = i;
				for (int j = i * 2; j <= n; j += i)
					prime[j] = false;
			}
	}
}