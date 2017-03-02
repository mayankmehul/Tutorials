package tutorial;

import java.util.Scanner;

public class Smallest_Twins {
	public void stMain() {
		int low, high;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range\nLow = ");
		low = sc.nextInt();
		System.out.println("High = ");
		high = sc.nextInt();
		find_Twins(low, high);
		System.out.println("Program Terminates.");
	}

	private void find_Twins(int l, int h) {
		int low = l, high = h, n=l;
		boolean r;
		while (low < high) {
			r = next_Prime_Number(n);
			if(r==true){
				r=next_Prime_Number(n+2);
				if(r==true){
					System.out.println("The twins are : "+n+"	"+(n+2));
					return;
				}
			}
		}
	}
	private boolean next_Prime_Number(int n){
		int i=2;
		while(i<Math.sqrt(n)){
			if(n%i==0){
				return false;
			}
			i++;
		}
		return true;
	}
}
