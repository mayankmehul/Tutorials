package interviewbit.string;

public class Compare_Version_Numbers {
	public int compareVersion(String a, String b) {
		String d = "\\.";
		String[] a_ = a.split(d);
		String[] b_ = b.split(d);
		int result = 0;
		if (a_.length <= b_.length)
			result = comapreStringArray(a_, b_);
		else {
			result = comapreStringArray(b_, a_);
			result = -(result);
		}
		return result;
	}

	private int comapreStringArray(String[] m, String[] n) {
		int i = 0;
		while (i < m.length) {
			if (Double.parseDouble(m[i]) == Double.parseDouble(n[i])) {
				i++;
			} else {
				if (Double.parseDouble(m[i]) > Double.parseDouble(n[i]))
					return 1;
				else {
					if (Double.parseDouble(m[i]) < Double.parseDouble(n[i]))
						return -1;
					else
						return 0;
				}
			}
		}
		if (i < n.length) {
			while (i < n.length) {
				if (Double.parseDouble(n[i]) != 0)
					return -1;
				else
					i++;
			}
		}
		return 0;
	}
}