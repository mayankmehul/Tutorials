package interviewbit.string;

import java.util.ArrayList;

public class LongestCommonPrefix {

	public String longestCommonPrefix(ArrayList<String> a) {
		String shortestString = getShortestStringFromArray(a);
		shortestString = getCommonPrefix(a, shortestString);
		return shortestString;
	}
	
	private String getShortestStringFromArray(ArrayList<String> a){
		int min = 0;
		for(int i=1;i<a.size();i++)
			if(a.get(i).length()<a.get(min).length())
				min = i;
		return a.get(min);
	}
	
	private String getCommonPrefix(ArrayList<String> a, String shortestString){
		boolean flag = true;
		int i=0;
		for(;i<shortestString.length()&&flag;i++){
			flag = checkIsCharacterCommonPrefix(a, shortestString.charAt(i), i);
			if(!flag)
				break;
		}
		return shortestString.substring(0, i);
	}
	
	private boolean checkIsCharacterCommonPrefix(ArrayList<String> a, char c, int index){
		for(int i=0;i<a.size();i++)
			if(a.get(i).charAt(index)!=c)
				return false;
		return true;
	}
}
