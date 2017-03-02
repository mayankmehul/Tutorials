package interviewbit.math;

public class Verify_Prime {
	public int isPrime(int a) {
		if(a<2)
			return 0;
		for (int i = 2; i <= Math.sqrt(a); i++) {
			if (a % i == 0) {
				return 0;
			}
		}
		return 1;
	}
}
