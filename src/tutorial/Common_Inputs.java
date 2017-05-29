package tutorial;

import java.util.ArrayList;
import java.util.Scanner;

public class Common_Inputs {
	public int[] inputIntArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array... ");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the elements of array... ");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		return a;
	}

	public ArrayList<Integer> inputIntArrayList() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array... ");
		int n = sc.nextInt();
		ArrayList<Integer> a = new ArrayList<Integer>();
		System.out.println("Enter the elements of array... ");
		int i = 0;
		for (i = 0; i < n; i++) {
			System.out.println(i);
			a.add(sc.nextInt());
		}
		sc.close();
		return a;
	}
}
