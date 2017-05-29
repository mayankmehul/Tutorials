package interviewbit.preetam;

import java.util.LinkedList;
import java.util.List;

public class StringParser {

	private final String INPUT = "12326#(5)123(5)";
	private StringBuffer output;

	static int count = 0;

	private String generateString(String raw) {
		int i = 0;
		output = new StringBuffer();
		List<Character> queue = new LinkedList<Character>();
		while (i < raw.length()) {
			queue.add(raw.charAt(i));
			if (queue.get(queue.size() - 1) == '#' || queue.get(queue.size() - 1) == '(') {
				output.append(updateCharacterAfterHash(queue));
			} else {
				if (queue.get(queue.size() - 1) == ')')
					output.append(updateCharacterAfterBraces(queue));
			}
			count++;
			i++;
		}
		if (!queue.isEmpty()) {
			count++;
			output.append(updateCharacterAfterHash(queue));
		}
		System.out.println("OUTPUT ::: " + output);
		return output.toString();
	}

	private String updateCharacterAfterHash(List<Character> queue) {
		StringBuffer str = new StringBuffer();
		while (queue.size() > 0) {
			int size = queue.size();
			if (queue.get(size - 1) == '#') {
				str.append(getCharacter(Integer.parseInt(queue.get(size - 3) + "" + queue.get(size - 2))));
				queue.remove(size - 1);
				queue.remove(size - 2);
				queue.remove(size - 3);
			} else {
				if (queue.get(size - 1) == '(') {
					queue.remove(size - 1);
				} else {
					String s = queue.get(size - 1) + "";
					str.append(getCharacter(Integer.parseInt(s)));
					queue.remove(size - 1);
				}
			}
			count++;
		}
		return str.reverse().toString();
	}

	private String updateCharacterAfterBraces(List<Character> queue) {
		StringBuffer str = new StringBuffer();
		if (queue.get(queue.size() - 1) == ')')
			queue.remove(queue.size() - 1);
		while (queue.size() > 0) {
			count++;
			str.append(queue.get(0));
			queue.remove(0);
		}
		return appendCharacterForMultipleTimes(Integer.parseInt(str.toString()), output.charAt(output.length() - 1));
	}

	private String appendCharacterForMultipleTimes(int lenght, char c) {
		StringBuffer s = new StringBuffer();
		while (lenght > 1) {
			count++;
			s.append(c);
			lenght--;
		}
		return s.toString();
	}

	private Character getCharacter(Integer number) {
		count++;
		return (char) (number + 96);
	}

	public static void main(String[] args) {
		StringParser stringParser = new StringParser();
		stringParser.generateString(stringParser.INPUT);
		System.out.println("Count:" + count);
	}
}
