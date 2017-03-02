package interviewbit.math;

import java.util.ArrayList;

public class Rearrange_Array {
	public void arrange(ArrayList<Integer> a) {
		ArrayList<Integer> b = new ArrayList<Integer>(a);
		for (int i = 0; i < a.size(); i++) {
			b.set(i, a.get(a.get(i)));
		}
		System.out.println("a = " + a);
		//a.clear();
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		for (int i = 0; i < b.size(); i++) {
			a.set(i, b.get(i));
		}
		System.out.println("a = " + a);
	}
}
