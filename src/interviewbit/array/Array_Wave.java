package interviewbit.array;

import java.util.ArrayList;
import java.util.Collections;

public class Array_Wave {
	int i;
	public ArrayList<Integer> arrayWave(ArrayList<Integer> a) {
		Collections.sort(a);
		for (i = 1; i < a.size(); i = i + 2) {
			Collections.swap(a, i - 1, i);
		}
		return a;
	}
}