import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
	
	Scanner s=new Scanner(System.in);

	
	int []arr= new int [20];
	int postiveInteger=0,negativeCount=0;
	int zeroCount=0,evenCount=0,oddCount=0;
	
	for(int i=0;i<arr.length;i++ ) {
		System.out.println("enter 20 integer:");
		arr[i]=s.nextInt();
	}
	

	for(int i=0;i<arr.length;i++ ) {
		
		if(arr[i]>0) 
	
		postiveInteger += 1;
		
		else if(arr[i]<0) 
			
			negativeCount+=1;
		
			else  
				zeroCount+=1;
			
		if(arr[i]%2==0) 
			
			evenCount+=1;
		
			else 
			
			oddCount+=1;
		
			
		}
	System.out.println("pos"+postiveInteger);
	System.out.println("neg"+negativeCount);
	System.out.println("zero"+zeroCount);
	System.out.println("odd"+oddCount);
	System.out.println("even"+evenCount);

		
	}
}
	
	

	


