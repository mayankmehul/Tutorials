package test;

public class CommaAdder {
	public static void main(String[] args) {
		String s= "1 3 -1 -3 5 3 6 7";
		s = s.replaceAll("\\s", ", ");
		System.out.println(s);
	}
}
