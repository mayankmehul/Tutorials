package interviewbit.stackandqueue;

import java.util.Stack;

public class MinStack {
	Stack<Integer> s = new Stack<Integer>();
	Stack<Integer> m = new Stack<Integer>();

	public void push(int x) {
		s.push(x);
		if (m.empty())
			m.push(x);
		else {
			if (m.peek() > x)
				m.push(x);
			else
				m.push(m.peek());
		}
	}

	public void pop() {
		if (!s.empty())
			s.pop();
		if (!m.empty())
			m.pop();
	}

	public int top() {
		if (s.empty())
			return -1;
		else
			return s.peek();
	}

	public int getMin() {
		if (m.empty())
			return -1;
		else
			return m.peek();
	}
}
