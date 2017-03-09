package tutorial;

import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaximumPrimeNumber2 {

	private boolean prime[];
	int maxPrime = 0;
	String printStatement = "";

	public static void main(String[] args) {
		new MaximumPrimeNumber2().getMaxPrimeNUmber();
	}
	
	public void getMaxPrimeNUmber(){
		int n = processInput();
		if(!printStatement.isEmpty()){
			System.out.println(printStatement);
			return;
		}
		System.out.println("Largest Prime Number upto " + n + "::: " + getMaxPrime(n));
	}
	
	private int processInput(){
		String input = takeInputFromUser();
		if(!printStatement.isEmpty()) return 0;
		return validateInput(input);
	}

	private String takeInputFromUser() {
		System.out.print("Enter the end of range ::: ");
		return readInput();
	}

	private String readInput() {
		try {
			String input = new BufferedReader(new InputStreamReader(System.in)).readLine();
			return input;
		} catch (IOException e) {
			printStatement = "Input Output Resourse Not Found.";
			return "";
		}
	}
	
	private int validateInput(String input) {
		int n = validateInputForInteger(input);
		if(!printStatement.isEmpty()) return 0;
		validateInputForRange(n);
		return n;
	}
	
	private int validateInputForInteger(String input) {
		try {
			 int n = Integer.parseInt(input);
			 return n;
		} catch (NumberFormatException e) {
			printStatement = "BAD INPUT.";
			return 0;
		}
	}
	
	private void validateInputForRange(int n) {
		lowerRangeValidation(n);
		upperRangeValidation(n);
	}

	private void lowerRangeValidation(int n) {
		if (n < 2)
			printStatement = "Your range is too low, prime numbers start 2";
	}
	
	private void upperRangeValidation(int n) {
		if (n > 61500000)
			printStatement = "Your range is too high for me, try keeping it within 61500000";
	}

	private int getMaxPrime(int n) {
		initializeArray(n);
		updateNonPrimeNumbers(n);
		return maxPrime;
	}

	private void initializeArray(int n) {
		prime = new boolean[n + 1];
		Arrays.fill(prime, true);
	}
	
	private void updateNonPrimeNumbers(int n) {
		for (int i = 2; i <= n; i++)
			if (prime[i]) {
				maxPrime = i;
				for (int j = i * 2; j <= n; j += i)
					prime[j] = false;
			}
	}
}