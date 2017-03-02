package interviewbit.math;

public class Power_Of_Two_Integers {
	public boolean isPower(int a) {
		if (a == 1)
			return true;
		int m, n, c = 0;
		for (m = 2; m < Math.sqrt(Integer.MAX_VALUE); m++) {
			for (n = 2;; n++) {
				c++;
				double pow = Math.pow(m, n);
				System.out.println("pow = " + pow);
				if (pow > Integer.MAX_VALUE) {
					System.out.println("overflow = " + pow);
					break;
				} else {
					int p = (int) pow;
					System.out.println("n = " + n + "\t\t\tp = " + p);
					if (pow == a) {
						System.out.println("c = " + c);
						return true;
					}
				}
			}
		}
		System.out.println("c = " + c);
		return false;
	}
}