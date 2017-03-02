package interviewbit.array;

import java.util.ArrayList;

public class Array_SetZero_2 {
	public void setZeroes(ArrayList<ArrayList<Integer>> a) {
		int i,j;
		boolean row[] = new boolean[a.size()];
		boolean col[] = new boolean[a.get(0).size()];
		System.out.println("rows = " + a.size() + "\tcolumns = " + a.get(0).size());
		for (i = 0; i < a.size(); i++) {
			for (j = 0; j < a.get(0).size(); j++) {
				if (a.get(i).get(j) == 0) {
					row[i] = true;
					col[j] = true;
				}
			}
		}
		
		System.out.println("\nROWS  ");
		for(i=0;i<row.length;i++)
		{
			System.out.print(row[i]?0:1);
		}
		System.out.println("\n\nCOL  ");
		for(i=0;i<col.length;i++)
		{
			System.out.print((col[i])?0:1);
		}
		
		for (i = 0; i < a.size(); i++) {
			for (j = 0; j < a.get(0).size(); j++) {
				a.get(i).set(j, ( (a.get(i).get(j) ) * (row[i]?0:1) * (col[j]?0:1)));
			}
		}
		
		System.out.println("\n");
		for (i = 0; i < a.size(); i++) {
			for (j = 0; j < a.get(0).size(); j++) {
				System.out.print(a.get(i).get(j));
			}
			System.out.println();
		}
	}
}
