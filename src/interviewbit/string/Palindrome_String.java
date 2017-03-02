package interviewbit.string;

public class Palindrome_String {
	public int isPalindrome(String a) {
		System.out.println(a);
		String b = a.replaceAll("[^A-Za-z0-9]", "");
		System.out.println("NEW y = " + b);
		int i = 0,j = b.length()-1;
		while(i<j){
			if(Character.toLowerCase(b.charAt(i))!=Character.toLowerCase(b.charAt(j))){
				return 0;
			}
			i++;
			j--;
		}
		return 1;
	}
}
