package tutorial;

import java.util.ArrayList;
import java.util.List;

public class Spiral_Array_Runner {
	public void spiralRunner() {
		ArrayList<Integer> r = new ArrayList<Integer>();
		List<ArrayList<Integer>> arrayList = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.add(4);
		a2.add(5);
		a2.add(6);
		ArrayList<Integer> a3 = new ArrayList<Integer>();
		a3.add(7);
		a3.add(8);
		a3.add(9);
		arrayList.add(a1);
		arrayList.add(a2);
		arrayList.add(a3);

		Spiral_Array obj = new Spiral_Array();
		r = obj.spiralOrder(arrayList);
		System.out.println("After processing : ");
		for (int i = 0; i < r.size(); i++) {
			System.out.print(r.get(i));
		}
	}
}
