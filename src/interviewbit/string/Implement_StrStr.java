package interviewbit.string;

public class Implement_StrStr {
	public int strStr(final String haystack, final String needle) {
		if (haystack.isEmpty() || needle.isEmpty())
			return -1;
		int i = 0;
		while (i < (haystack.length() - needle.length() + 1)) {
			if (haystack.charAt(i) == needle.charAt(0)) {
				boolean b = isPresent(haystack, needle, i);
				if (b == true) {
					return i;
				}
			}
			i++;
		}
		return -1;
	}

	private boolean isPresent(String haystack, String needle, int index) {
		int i = 0;
		while (i < needle.length()) {
			if (haystack.charAt(index + i) != needle.charAt(i)) {
				return false;
			}
			i++;
		}
		return true;
	}
}
