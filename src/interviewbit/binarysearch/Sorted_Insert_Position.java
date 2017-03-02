package interviewbit.binarysearch;

import java.util.ArrayList;

public class Sorted_Insert_Position {
	public int searchInsert(ArrayList<Integer> a, int b) {
		int index = binarySearch(a, a.size()-1, b);
		System.out.println("index = " + index);
		if(index!=-1){
			return index;
		}
		return 0;
	}
	
	private int binarySearch(ArrayList<Integer> a, int size, int x) {
		int start = 0, end = size, mid = 0;
		while (start <= end) {
			mid = start + (end - start) / 2;
			if (a.get(mid) == x) {
				return mid;
			} else {
				if (a.get(mid) > x)
					end = mid - 1;
				else
					start = mid + 1;
			}
		}
		return -1;
	}
}
