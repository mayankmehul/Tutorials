package interviewbit.stackandqueue;

import java.util.ArrayList;
import java.util.Stack;

public class NearestSmallerElement {

	public ArrayList<Integer> prevSmaller(ArrayList<Integer> arr) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		Stack<Integer> s = new Stack<Integer>();
		int i = 0;
		while (i < arr.size()) {
			while (!s.empty() && s.peek() >= arr.get(i))
				s.pop();

			if (s.empty())
				a.add(-1);
			else
				a.add(s.peek());
			s.push(arr.get(i));
			i++;
		}
		return a;
	}

	public ArrayList<Integer> prevSmaller2(ArrayList<Integer> arr) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		int i = 0, j = 0;
		boolean setFlag = true;
		while (i < arr.size()) {
			j = i - 1;
			setFlag = true;
			while (j >= 0) {
				if (arr.get(i) > arr.get(j)) {
					a.add(arr.get(j));
					setFlag = false;
					break;
				}
				j--;
			}
			if (setFlag)
				a.add(-1);
			i++;
		}
		return a;
	}
}
