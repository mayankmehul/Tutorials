package interviewbit.array;

import java.util.ArrayList;

public class Interval {
	public int start;
	public int end;

	public Interval() {
		start = 0;
		end = 0;
	}

	public Interval(int s, int e) {
		start = s;
		end = e;
	}

	public ArrayList<Interval> insertInterval(ArrayList<Interval> intervals,
			Interval newInterval) {
		int startPoint = -1;
		int endPoint = -1;
		int startIndex = 0;
		int endIndex = 0;

		for (Interval o : intervals) {
			System.out.println("Interval  :  " + o.start + "\t" + o.end);
		}
		System.out.println("new interval = " + newInterval.start + "\t"
				+ newInterval.end);

		if (newInterval.start > newInterval.end) {
			int temp = newInterval.start;
			newInterval.start = newInterval.end;
			newInterval.end = temp;
			System.out.println("UPDATED interval = " + newInterval.start + "\t"
					+ newInterval.end);
		}
		if (intervals.isEmpty()) {
			intervals.add(newInterval);
			return intervals;
		}
		if (newInterval.start <= intervals.get(0).start
				&& newInterval.end >= intervals.get(intervals.size() - 1).end) {
			intervals.clear();
			intervals.add(newInterval);
			return intervals;
		}
		if (newInterval.start > intervals.get(intervals.size() - 1).end) {
			intervals.add(newInterval);
			return intervals;
		}
		if (newInterval.end < intervals.get(0).start) {
			intervals.add(0, newInterval);
			return intervals;
		}
		if (newInterval.start < intervals.get(0).start
				&& newInterval.end == intervals.get(0).end) {
			intervals.get(0).start = newInterval.start;
			return intervals;
		}

		for (int a = 0; a < intervals.size(); a++) {
			if (newInterval.start < intervals.get(a).end) {
				if (newInterval.end < intervals.get(a).start) {
					intervals.add(a, newInterval);
					return intervals;
				} else {
					int m = a;
					// System.out.println(a);
					if (newInterval.start < intervals.get(a).start) {
						startPoint = newInterval.start;
						if (a > 0) {
							startIndex = a - 1;
						}
					} else {
						startPoint = intervals.get(a).start;
						startIndex = a;
					}

					while (m < intervals.size()) {
						if (newInterval.end <= intervals.get(m).end) {
							if (newInterval.end >= intervals.get(m).start) {
								endPoint = intervals.get(m).end;
								endIndex = m;
								break;
							} else {
								endPoint = newInterval.end;
								endIndex = m;
								break;
							}
						} else {
							if (m > a) {
								/*
								 * System.out.println("LAST ELSE\t start = " +
								 * intervals.get(m).start + "\tend" +
								 * intervals.get(m).end);
								 */
								intervals.remove(m);
							} else
								m++;
						}
					}
					// System.out.println("start  =  " + startPoint +
					// "\tend  = "
					// + endPoint);
					if (startPoint != 0 && endPoint != 0) {
						break;
					}
				}
			}
		}

		for (Interval o : intervals) {
			System.out.println("Interval  :  " + o.start + "         " + o.end);
		}

		System.out.println("POINTS\t\t\tstart  =  " + startPoint + "\tend  = "
				+ endPoint);
		System.out.println("\nINDEX\tstart = " + startIndex + "\tend = "
				+ endIndex);

		if (startPoint != -1 && endPoint != -1) {
			if (intervals.get(startIndex).end >= startPoint) {
				if (intervals.get(endIndex).start > endPoint) {
					intervals.get(startIndex).end = endPoint;
					if (intervals.get(startIndex).start > startPoint) {
						intervals.get(startIndex).start = startPoint;
					}
					return intervals;
				} else {
					intervals.get(startIndex).end = intervals.get(endIndex).end;
					intervals.remove(endIndex);
					if (intervals.get(startIndex).start > startPoint) {
						intervals.get(startIndex).start = startPoint;
					}
					return intervals;
				}
			} else {
				intervals.get(startIndex + 1).start = startPoint;
				if (intervals.get(startIndex + 1).end <= endPoint) {
					intervals.get(startIndex + 1).end = endPoint;
					if ((startIndex + 1) != endIndex) {
						if (intervals.get(startIndex + 1).end == intervals
								.get(endIndex).end) {
							intervals.remove(endIndex);
						}
					}
					return intervals;
				}
				if ((startIndex + 1) != endIndex) {
					if (intervals.get(startIndex + 1).end > intervals
							.get(endIndex).start) {
						intervals.get(startIndex + 1).end = intervals
								.get(endIndex).end;
						intervals.remove(endIndex);
						return intervals;
					}
				}
			}
		}
		if (startPoint == -1 && endPoint == -1) {
			System.out.println("WTF");
		}
		if (startPoint != -1 && endPoint == -1) {
			if (intervals.get(startIndex).end < startPoint) {
				if (intervals.get(startIndex + 1).start > startPoint) {
					intervals.get(startIndex + 1).start = startPoint;
				}
				if (intervals.get(startIndex + 1).end < newInterval.end) {
					intervals.get(startIndex + 1).end = newInterval.end;
				}
				return intervals;
			} else {
				intervals.get(startIndex).end = newInterval.end;
				return intervals;
			}
		}
		return intervals;
	}
}
