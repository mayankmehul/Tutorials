package interviewbit.array;

import java.util.ArrayList;

public class Array_Maxset {
	public ArrayList<Integer> maxset(ArrayList<Integer> a) {
		int k, startPoint = 0, maxStartPoint = -1, maxEndPoint = -1;
		long sum = 0, maxsum = -1;
		ArrayList<Long> sumSubArray = new ArrayList<Long>();
		ArrayList<Integer> startIndex = new ArrayList<Integer>();
		ArrayList<Integer> endIndex = new ArrayList<Integer>();
		
		for (k = 0; k < a.size(); k++) {
			if (a.get(k) >= 0) {
				sum += a.get(k);
			} else {
				sumSubArray.add(sum);
				startIndex.add(startPoint);
				endIndex.add(k - 1);
				sum = 0;
				startPoint = k + 1;
			}
		}
		sumSubArray.add(sum);
		startIndex.add(startPoint);
		endIndex.add(k - 1);

		System.out.println(sumSubArray);
		System.out.println(startIndex);
		System.out.println(endIndex);

		for (k = 0; k < sumSubArray.size(); k++) {
			if (sumSubArray.get(k) > maxsum) {
				maxsum = sumSubArray.get(k);
				maxStartPoint = startIndex.get(k);
				maxEndPoint = endIndex.get(k);
			} else {
				if (sumSubArray.get(k) == maxsum) {
					int currLenght = (endIndex.get(k) - startIndex.get(k)) + 1;
					int lastLenght = maxEndPoint - maxStartPoint + 1;
					if (currLenght > lastLenght) {
						maxsum = sumSubArray.get(k);
						maxStartPoint = startIndex.get(k);
						maxEndPoint = endIndex.get(k);
					}
				}
			}
		}

		System.out.println(maxStartPoint);
		System.out.println(maxEndPoint);
		System.out.println(maxsum);
		
		ArrayList<Integer> ans = new ArrayList<Integer>();
		for(k=maxStartPoint;k<=maxEndPoint;k++)
		{
			ans.add(a.get(k));
		}
		
		return ans;
	}
}
