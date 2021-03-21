
public class DuplicateValue {

	public static void main(String[] args) {
	int []arr= {1,5,6,9,1,8,5};
	int length=arr.length;
	for(int i=0;i<length;i++) {
		for(int j=i+1;j<length;j++) {
			if(arr[i]==arr[j])
				System.out.println(""+arr[j]);
		}
		
	}
	

	}

}
