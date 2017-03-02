package tutorial;

import java.util.ArrayList;
import java.util.List;

public class Spiral_Array {
	public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> a) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		// Populate result;
		int m = a.size(), n = a.get(0).size();		
		System.out.println("m = " + m);
		System.out.println("n = " + n);
		System.out.println("Array : ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a.get(i).get(j));
			}
			System.out.println("");
		}
		
		int east = n - 1, south = m - 1, north = 0, west = 0, arraySize = (m * n);
		String last_trace = "north";
		do {
			if (last_trace == "north") {
				result = trace_east(a, result, west, east, north);
				north++;
				last_trace = "east";
				if (result.size() >= arraySize)
					break;
			}
			if (last_trace == "east") {
				result = trace_south(a, result, north, south, east);
				east--;
				last_trace = "south";
				if (result.size() >= arraySize)
					break;
			}
			if (last_trace == "south") {
				result = trace_west(a, result, east, west, south);
				south--;
				last_trace = "west";
				if (result.size() >= arraySize)
					break;
			}
			if (last_trace == "west") {
				result = trace_north(a, result, south, north, west);
				west++;
				last_trace = "north";
				if (result.size() >= arraySize)
					break;
			}
			System.out.println("Result Size = " + result.size());
			System.out.println("Array Size = " + (m * n));
		} while (result.size() < m * n);
		return result;
	}

	private ArrayList<Integer> trace_east(List<ArrayList<Integer>> a,
			ArrayList<Integer> result, int start, int end, int permanent) {
		int val;
		for (int i = start; i <= end; i++) {
			val = a.get(permanent).get(i);
			result.add(val);
		}
		return result;
	}

	private ArrayList<Integer> trace_south(List<ArrayList<Integer>> a,
			ArrayList<Integer> result, int start, int end, int permanent) {
		int val;
		for (int i = start; i <= end; i++) {
			val = a.get(i).get(permanent);
			result.add(val);
		}
		return result;
	}

	private ArrayList<Integer> trace_west(List<ArrayList<Integer>> a,
			ArrayList<Integer> result, int start, int end, int permanent) {
		int val;
		for (int i = start; i >= end; i--) {
			val = a.get(permanent).get(i);
			result.add(val);
		}
		return result;
	}

	private ArrayList<Integer> trace_north(List<ArrayList<Integer>> a,
			ArrayList<Integer> result, int start, int end, int permanent) {
		int val;
		for (int i = start; i >= end; i--) {
			val = a.get(i).get(permanent);
			result.add(val);
		}
		return result;
	}
}
