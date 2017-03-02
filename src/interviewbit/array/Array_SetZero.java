package interviewbit.array;

import java.util.ArrayList;

public class Array_SetZero {
	public void setZeroes(ArrayList<ArrayList<Integer>> a) {
		int i, j, rows = a.size(), columns = a.get(0).size();
		ArrayList<Integer> rowArrayList = new ArrayList<Integer>();
		ArrayList<Integer> colArrayList = new ArrayList<Integer>();

		System.out.println("rows = " + rows + "\tcolumns = " + columns);
		for (i = 0; i < rows; i++) {
			// System.out.print("Value = ");
			for (j = 0; j < columns; j++) {
				System.out.print(a.get(i).get(j));
			}
			System.out.println();
		}

		for (i = 0; i < rows; i++) {
			for (j = 0; j < columns; j++) {
				if (a.get(i).get(j) == 0) {
					rowArrayList.add(i);
					colArrayList.add(j);
				}
			}
		}

		if (columns == 1 || rows == 1) {
			if (columns == 1) {
				if (!rowArrayList.isEmpty()) {
					i = 0;
					while (i < rows) {
						a.get(i).set(0, 0);
						i++;
					}
				}
			}
			if (rows == 1) {
				if (!rowArrayList.isEmpty()) {
					i = 0;
					while (i < columns) {
						a.get(0).set(i, 0);
						i++;
					}
				}
			}
		} else {
			for (i = 0, j = 0; j < rowArrayList.size(); i++) {
				a.get(rowArrayList.get(j)).set(i, 0);
				if (i + 1 == columns) {
					i = -1;
					j++;
				}
			}
			for (i = 0, j = 0; j < colArrayList.size(); i++) {
				a.get(i).set(colArrayList.get(j), 0);
				if (i + 1 == rows) {
					i = -1;
					j++;
				}
			}
		}

		System.out.println("Final	:	 ");
		for (i = 0; i < rows; i++) {
			// System.out.print("Value = ");
			for (j = 0; j < columns; j++) {
				System.out.print(a.get(i).get(j));
			}
			System.out.println();
		}
	}
}
