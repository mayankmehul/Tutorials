package interviewbit.array;

import java.util.ArrayList;

public class PascalTriangleKthRow {
	public ArrayList<Integer> getRow(int a) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		Integer b =0,n=0;
		while(b<=a){
			n=combinations(b, a);
			l.add(n);
			b++;
		}
		return l;
	}

	private Integer combinations(Integer low, Integer high) {
		if (low == 0 || low == high)
			return 1;
		Integer diff = high - low;
		Long numerator=1L, denominator=1L;
		if (low > diff) {
			low = low + diff;
			diff = low - diff;
			low = low - diff;
		}
		while (high > diff) {
			numerator *= high;
			high--;
		}
		while (low > 0) {
			denominator *= low;
			low--;
		}
		diff = (int) (numerator / denominator);
		return diff;
	}
}
