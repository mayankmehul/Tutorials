package interviewbit.array;

import java.util.List;

public class Array_Maxsum_SS {
	public int maxSubArray(final List<Integer> a) {  
		int result[] = new int[a.size()];
    int max = -9999;
    //int low = 0,high = 0;
    int count = 0;
    if(a.size()==1)
		return a.get(0);
    for(int j = 0 ; j < a.size() - 1 ; j++){
        for(int i = j ; i < a.size() - 1 ; i++){
            if(i == j){
                count = a.get(i) + a.get(i+1);
                
                if(max < count){
                	if(count < a.get(i)){
						max = a.get(i);	
					}else{
						max = count;
					}
                }else{
                	if(max < a.get(i)){
						max = a.get(i);	
					}
                }
                result[i] = count;    
            }else{
                count = result[i-1]  + a.get(i+1);
                if(max < count){
                	if(count < a.get(i)){
						max = a.get(i);	
					}else{
						max = count;
					}
                }else{
                	if(max < a.get(i)){
						max = a.get(i);	
					}
                }
                result[i] = count;
            }
        }
    }
    if(a.get(a.size()-1) > max){
		return a.get(a.size()-1);
	}
    return max;
}
}