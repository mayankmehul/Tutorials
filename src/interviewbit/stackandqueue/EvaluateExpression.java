package interviewbit.stackandqueue;

import java.util.ArrayList;
import java.util.Stack;

public class EvaluateExpression {
	public int evalRPN(ArrayList<String> a) {
		Stack<String> s = new Stack<String>();
		for(int i =0;i<a.size();i++){
			if(!a.get(i).equals("+")&&!a.get(i).equals("-")&&!a.get(i).equals("*")&&!a.get(i).equals("/")){
				s.push(a.get(i));
			}else{
				Character op = a.get(i).charAt(0);
				int op2= Integer.parseInt(s.pop());
				int op1= Integer.parseInt(s.pop());
				int r = operation(op1,op2, op);
				s.push(String.valueOf(r));
			}
		}
		return Integer.parseInt(s.peek());
	}

	private int operation(int a, int b, Character op) {
		int r = 0;
		switch (op) {
		case '+':
			r = a + b;
			break;
		case '-':
			r = a - b;
			break;
		case '*':
			r = a * b;
			break;
		case '/':
			r = a / b;
			break;

		default:
			System.out.println("Wrong Operation!!!");
			break;
		}
		return r;
	}
}
