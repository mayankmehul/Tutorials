package interviewbit.binarysearch;

public class Square_Root_of_Integer {
	public int sqrt(int a) {
		if(a==1)
			return 1;
		int start = 0, end = a;
		while (start <= end) {
			long mid = start + (end - start) / 2;
			if (mid > Integer.MAX_VALUE) {
				end /= 2;
			}
			System.out.println("mid = " + mid);
			if ((mid * mid) == a) {
				return (int) mid;
			} else {
				if (((mid * mid) < a) && (((mid + 1) * (mid + 1)) > a)) {
					return (int) mid;
				} else {
					if (((mid * mid) > a)) {
						end = (int) (mid - 1);
					} else {
						start = (int) (mid + 1);
					}
				}
			}
		}
		return 1;
	}
}