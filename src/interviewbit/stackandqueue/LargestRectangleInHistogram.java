package interviewbit.stackandqueue;

import java.util.ArrayList;
import java.util.Stack;

public class LargestRectangleInHistogram {
	public int largestRectangleArea(ArrayList<Integer> a) {
		Stack<Integer> s = new Stack<Integer>();
		int i = 0, top, area, areaMax = a.get(0);
		while (i < a.size()) {
			if (s.isEmpty() || a.get(s.peek()).compareTo(a.get(i)) < 0)
				s.push(i++);
			else {
				top = s.pop();
				area = a.get(top) * (s.empty() ? i : i - s.peek() - 1);
				if (areaMax < area)
					areaMax = area;
			}
		}
		while (!s.isEmpty()) {
			top = s.pop();
			area = a.get(top) * (s.empty() ? i : i - s.peek() - 1);
			if (areaMax < area)
				areaMax = area;
		}
		return areaMax;
	}
}
