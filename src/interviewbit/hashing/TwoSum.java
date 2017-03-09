package interviewbit.hashing;

import java.util.ArrayList;
import java.util.List;

public class TwoSum {
	public ArrayList<Integer> twoSum(final List<Integer> a, int b) {
		ArrayList<Integer> r=new ArrayList<Integer>();
		if(a==null||a.size()==1)return r;
		int i=0,j=1;
		while(j<a.size()){
			i=0;
			while(i<j){
				if(a.get(i)+a.get(j)==b){
					r.add(i+1);r.add(j+1);return r;
				}
				i++;
			}j++;
		}
		return r;
	}
}
