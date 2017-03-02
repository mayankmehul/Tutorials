import java.util.ArrayList;
import java.util.Arrays;

import interviewbit.array.Maxsum_IB_Solution;
import interviewbit.string.*;

public class Index {
	public static void main(String s[]) {
		System.out.println("Running...");

		/*
		ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(-28, -27, 38, 49));
		ArrayList<Integer> b = new ArrayList<Integer>(Arrays.asList(-34, 9, 36, 48));
		
		//ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(-43, -25, -18, -15, -10, 9, 39, 40));
		//ArrayList<Integer> b = new ArrayList<Integer>(Arrays.asList(-2));
		
		//ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(-37, -9, 10, 19));
		//ArrayList<Integer> b = new ArrayList<Integer>(Arrays.asList(-29, 18, 46));
		
		//ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(-35, -30, 22, 27, 33, 35, 40, 50));
		//ArrayList<Integer> b = new ArrayList<Integer>(Arrays.asList(-39, -28, -25, -17, 1, 30, 33, 37));
		*/
		
		//String a ="PAYPALISHIRING";
		String a ="qwerty";
		
		String x = new Longest_Palindromic_Substring().subStringLP(a);
		System.out.println("X = " + x);
	}
}
