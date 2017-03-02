package interviewbit.array;

import java.util.ArrayList;

public class Array_Reach {
	public int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {
        int numSteps = 0;
        for(int i = 1; i < X.size(); i++){
            numSteps += Math.max( Math.abs(X.get(i) - X.get(i-1)), Math.abs(Y.get(i) - Y.get(i-1)) ); 
        }
        return numSteps;
    }
}

/*
public class Solution {
    // X and Y co-ordinates of the points in order.
    // Each point is represented by (X.get(i), Y.get(i))
    public int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {
       ArrayList<Integer> x = X;
		ArrayList<Integer> y = Y;
		if (x.size() != y.size())
			return 0;
		if (x.size() == 1 || y.size() == 1)
			return 0;
		int steps = 0, x_diff, y_diff;
		while (x.size() > 1) {
			x_diff = x.get(1) - x.get(0);
			y_diff = y.get(1) - y.get(0);

			if ((x_diff == y_diff) || x_diff == (-(y_diff))) {
				steps += Math.abs(x_diff);
				x.remove(0);
				y.remove(0);
				continue;
			}
			if (x_diff > 0 && y_diff > 0) {
				if (x_diff < y_diff) {
					steps = steps + x_diff + (y_diff - x_diff);
					x.remove(0);
					y.remove(0);
					continue;
				} else {
					steps = steps + y_diff + (x_diff - y_diff);
					x.remove(0);
					y.remove(0);
					continue;
				}
			}
			if (x_diff < 0 && y_diff < 0) {
				x_diff = Math.abs(x_diff);
				y_diff = Math.abs(y_diff);
				if (x_diff < y_diff) {
					steps = steps + x_diff + (y_diff - x_diff);
					x.remove(0);
					y.remove(0);
					continue;
				} else {
					steps = steps + y_diff + (x_diff - y_diff);
					x.remove(0);
					y.remove(0);
					continue;
				}
			}
			if (x_diff > 0 && y_diff < 0) {
				y_diff = Math.abs(y_diff);
				if (x_diff < y_diff) {
					steps = steps + x_diff + (y_diff - x_diff);
					x.remove(0);
					y.remove(0);
					continue;
				} else {
					steps = steps + y_diff + (x_diff - y_diff);
					x.remove(0);
					y.remove(0);
					continue;
				}
			}
			if (x_diff < 0 && y_diff > 0) {
				x_diff = Math.abs(x_diff);
				if (x_diff < y_diff) {
					steps = steps + x_diff + (y_diff - x_diff);
					x.remove(0);
					y.remove(0);
					continue;
				} else {
					steps = steps + y_diff + (x_diff - y_diff);
					x.remove(0);
					y.remove(0);
					continue;
				}
			}
			if (x_diff == 0) {
				y_diff = Math.abs(y_diff);
				steps += y_diff;
				x.remove(0);
				y.remove(0);
				continue;
			}
			if (y_diff == 0) {
				x_diff = Math.abs(x_diff);
				steps += x_diff;
				x.remove(0);
				y.remove(0);
				continue;
			}
		}
		return steps;
    }
}
*/