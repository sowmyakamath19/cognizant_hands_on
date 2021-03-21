import java.util.Arrays;

public class SecondSmallest {

	public static void main(String[] args) {
		int []a=new int[] {1,10,3,4,5};
		System.out.println("Second Smallest number in array is:"+getSecondSmallest(a));
	}


public static int getSecondSmallest(int []arr) {
	
	Arrays.sort(arr);
	return arr[1];
		
	
}
}