package tutorial;

public class Common_Sorting {
	public int[] sortIntArray(int[] arr){
		int i,j,l;
		int[] a = arr;
		l=a.length;
		for(i=l-1;i>0;i--){
			for(j=1;j<=i;j++){
				if(a[j]<a[j-1]){
					int temp = a[j];
					a[j] = a[j-1];
					a[j-1]=temp;
				}
			}
		}
		return arr;
	}
}
