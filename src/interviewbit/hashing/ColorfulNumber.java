package interviewbit.hashing;

import java.util.HashMap;

public class ColorfulNumber {
	public int colorful(int a) {
		String numString= Integer.toString(a);
		HashMap<Integer, Integer> m=new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> cm=new HashMap<Integer, Integer>();
		int i=0,l=1,k=0,p=1;
		while(i+l<=numString.length()){
			m.put(k, Integer.parseInt(numString.substring(i, i+l)));
			i++;
			k++;
			if(i+l-1==numString.length()){
				i=0;l++;
			}
		}
		System.out.println(m);
		for(k=0;k<m.size();k++){
			i=0;
			l=1;p=1;
			numString=m.get(k).toString();
			while(i<numString.length()){
				p*=Integer.parseInt(numString.substring(i, i+1));
				i++;
			}
			System.out.println("p = " + p);
			if(cm.containsKey(p)){
				System.out.println(cm);
				return 0;
			}else{
				cm.put(p, 1);
			}
		}
		return 1;
	}
	
	public int colorful2(int a) {
		String numString= Integer.toString(a);
		HashMap<Integer, Integer> m=new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> cm=new HashMap<Integer, Integer>();
		int i=0,l=1,k=0;
		while(i+l<=numString.length()){
			m.put(k, Integer.parseInt(numString.substring(i, i+l)));
			i++;
			k++;
			if(i+l-1==numString.length()){
				i=0;l++;
			}
		}
		System.out.println(m);
		for(i=0;i<m.size();i++){
			for(l=i+1;l<m.size();l++){
				k=m.get(i)*m.get(l);
				if(cm.containsKey(k)){
					System.out.println(cm);
					System.out.println("m.get("+i+") = " + m.get(i) + "\t\tm.get("+l+") = " + m.get(l) + "\t\tk = " + k);
					return 0;
				}else{
					System.out.println("m.get("+i+") = " + m.get(i) + "\t\tm.get("+l+") = " + m.get(l) + "\t\tk = " + k);
					cm.put(k, k);
				}
			}
		}
		return 1;
	}
}
