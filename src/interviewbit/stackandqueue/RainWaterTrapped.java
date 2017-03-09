package interviewbit.stackandqueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RainWaterTrapped {
	public int trap(final List<Integer> a) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		ArrayList<Integer> r = new ArrayList<Integer>();
		Integer water = 0, i = 0, j = 0;
		l.add(a.get(0));
		for (i = 1; i < a.size(); i++)
			l.add(Math.max(l.get(i - 1), a.get(i)));

		r.add(a.get(a.size() - 1));
		for (i = a.size() - 2; i >= 0; i--) {
			r.add(Math.max(r.get(j), a.get(i)));
			j++;
		}
		Collections.reverse(r);
		System.out.println("l : " + l);
		System.out.println("r : " + r);
		for (i = 0; i < a.size(); i++)
			water += Math.min(l.get(i), r.get(i)) - a.get(i);

		return water;
	}
	
	public int trapTest(final List<Integer> a) {
	    ArrayList<Integer> l= new ArrayList<Integer>(a.size());
	    ArrayList<Integer> r= new ArrayList<Integer>(a.size());
	    
	    
	    
	    if(a.size()==0||a.size()==1){
	        return 0;
	    }
	    //left to right
	    int max=a.get(0);
	    l.add(0,max);
	    for(int i=1;i<a.size();i++){
	        if(a.get(i)<max){
	            l.add(max);
	        }else{
	            max=a.get(i);
	            l.add(max);
	        }
	    }
	    
	    //right to left
	    max=a.get(a.size()-1);
	    r.add(max);
	    for(int i=a.size()-2;i>=0;i--){
	        if(a.get(i)<max){
	            r.add(max);
	        }else{
	            max=a.get(i);
	            r.add(max);
	        }
	    }
	    Collections.reverse(r);
	    int total=0;
	    for(int i=0;i<a.size();i++){
	        total=total+(Math.min(l.get(i),r.get(i))-a.get(i));
	    }
	    
	    return total;
	}
}