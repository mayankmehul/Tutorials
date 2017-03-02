package interviewbit.math;

public class Palindrome_Integer {
	public boolean isPalindrome(int a) {
		int b = 0, c = a;
		while (c > 0) {
			b = b * 10;
			b += c % 10;
			c /= 10;
		}
		System.out.println("b = " + b);
		if(a==b)
			return true;
		
		return false;
	}
}
