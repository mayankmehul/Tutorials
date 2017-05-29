package tutorial;

import java.util.Scanner;

public class Count_Triplets {
	public void countTriplets() {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers you wish to enter : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter your array : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the sum : ");
		int sum = sc.nextInt();
		sc.close();
		Common_Sorting cs = new Common_Sorting();
		arr = cs.sortIntArray(arr);
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i] + ", ");
		}
		
		System.out.println("Triplets with the sum less than "+sum+" are : ");
		for (int i = 0; i < n-2; i++) {
			for (int j = i+1; j < n-1; j++) {
				for (int k = j+1; k < n; k++) {
					int s = arr[i] + arr[j] + arr[k];
					if (s < sum) {
						//System.out.println("({0}, {1}, {2})"+arr[i]+arr[j]+arr[k]);
						System.out.println(arr[i]+", "+arr[j]+", "+arr[k]);
					}
					else{
						break;
					}
				}
			}
		}
		
	}
}