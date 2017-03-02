package interviewbit.math;

public class Grid_Unique_Paths {
	public int uniquePaths(int a, int b) {
		int p = 0;
		p = getPaths(a, b);
		return p;
	}

	private int getPaths(int m, int n) {
		if (m == 1 || n == 1) {
			return 1;
		}
		return getPaths(m - 1, n) + getPaths(m, n - 1);
	}
}

