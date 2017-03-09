package interviewbit.backtracking;

import java.math.BigInteger;

public class ModularExpression {
	public int Mod(int a, int b, int c) {
		BigInteger r;
		System.out.println("a = " + a + "\t\tb=" + b + "\t\tc=" + c);
		if (b == 0)
			return 1%c;
		if (b == 0||b == 1) {
			if (a < 0)
				a = c + a;
			return a % c;
		}
		if (b % 2 == 0) {
			r = BigInteger.valueOf(Mod(a, b / 2, c) % c);
			r = ((r.multiply(r)).mod(BigInteger.valueOf(c)));
			System.out.println("r -------------->>>>>>>>>>>> " + r);
			return r.intValue();
		} else {
			r = (BigInteger.valueOf(Mod(a, 1, c)).multiply(BigInteger
					.valueOf(Mod(a, b - 1, c)))).mod(BigInteger.valueOf(c));
			System.out.println("r -------------->>>>>>>>>>>> " + r);
			return r.intValue();
		}
	}
}
