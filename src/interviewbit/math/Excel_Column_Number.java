package interviewbit.math;

public class Excel_Column_Number {
	public int titleToNumber(String a) {
		int ans = 0, i = 0, power = 0;
		char c;
		System.out.println(a.length());
		while (i < a.length()) {
			c = a.charAt(a.length() - (i+1));
			ans = (int) (ans + (getCharValue(c) * (Math.pow(26, power))));
			power++;
			i++;
		}
		return ans;
	}

	private int getCharValue(char c) {
		int v = (int) c;
		System.out.println("v = " + v);
		v -= 64;
		System.out.println("updated v = " + v);
		return v;
	}
}
