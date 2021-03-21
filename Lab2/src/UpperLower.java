import java.util.Arrays;

public class UpperLower {

	public static void main(String[] args) {
		String [] arr= {"Sowmya","Ramya","Bhavya","Anu","Ram"};
		sortStrings(arr);
		
		
	}
	
public static void sortStrings(String []a) {
	Arrays.sort(a);
	int length=a.length;
	for(int i=0;i<length;i++) { 
		if(i<=(length/2)) 
			a[i]=a[i].toUpperCase();
			else
				a[i]=a[i].toLowerCase();
			
		}
	
		
	//if(length%2==0) {
		//String[]a1=Arrays.copyOfRange(a, 0,length/2);
		//String[]a2=Arrays.copyOfRange(a,length/2,length);
		
	//}
	//else
	//	{
		//	 String [] a1=Arrays.copyOfRange(a, 0,length+1/2);
	//	String [] a2=Arrays.copyOfRange(a, length+1/2,length);

		//}
	
	System.out.println(Arrays.toString(a));
		
	
		
		
	}
}

