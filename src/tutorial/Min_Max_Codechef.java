package tutorial;

import java.util.ArrayList;

public class Min_Max_Codechef {
	public void Min_Max_CC() {
		ArrayList<Integer> a;
		int l, cost = 0;
		Common_Inputs ci = new Common_Inputs();
		a = ci.inputIntArrayList();
		System.out.println(a.get(0));
		System.out.println(a.get(1));
		System.out.println(a.size());
		while (a.size() > 1) {
			l = a.size();
			int min = search_Min(a, l);
			int max = largest_Neighbour(a, l, min);
			cost = cost + a.get(min);
			a = minimizeArray(a, l, min, max);
		}
		System.out.println("THe final array : " + a);
		System.out.println("Cost = " + cost);
	}

	private int search_Min(ArrayList<Integer> a, int n) {
		ArrayList<Integer> arr = a;
		int min = 0, min_val = 1000;
		for (int i = 0; i < n; i++) {
			if (min_val > arr.get(i)) {
				min_val = arr.get(i);
				min = i;
			}
		}
		return min;
	}

	private int largest_Neighbour(ArrayList<Integer> a, int n, int min) {
		int max;
		ArrayList<Integer> arr = a;
		if (min == n - 1)
			max = min - 1;
		else {
			if (min == 0) {
				max = min + 1;
			} else {
				if (arr.get(min - 1) > arr.get(min + 1))
					max = min - 1;
				else
					max = min + 1;
			}
		}
		return max;
	}

	private ArrayList<Integer> minimizeArray(ArrayList<Integer> a, int n,
			int min, int max) {
		ArrayList<Integer> arr = a;
		arr.remove(min);
		return arr;
	}
}
