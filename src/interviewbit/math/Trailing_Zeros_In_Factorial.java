package interviewbit.math;

public class Trailing_Zeros_In_Factorial {
	public int trailingZeroes(int a) {
	    int count = 0;
		while (a > 1) {
			if (a == 5) {
				count++;
				a = 1;
			}
			if (a % 5 == 0) {
				int n = a;
				while (n % 5 == 0) {
					count++;
					n /= 5;
				}
				a -= 5;
			} else {
				a--;
			}
		}
		return count;
	}
}
