package interviewbit.string;

public class Length_Of_Last_Word {
	public int lengthOfLastWord(final String a) {
		int i = a.length() - 1, l = 0;
		while (i >= 0) {
			if ((int) a.charAt(i) == 32) {
				if (l > 0)
					return l;
				else
					l = 0;
			} else
				l++;
			i--;
		}
		return l;
	}
}
