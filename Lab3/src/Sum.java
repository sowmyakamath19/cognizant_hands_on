import java.util.Scanner;
import java.util.StringTokenizer;

public class Sum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		String num=sc.nextLine();
		StringTokenizer st=new StringTokenizer(num);
		while(st.hasMoreTokens()){
			int num1=0;
			String s=st.nextToken();
			num1=Integer.parseInt(s);
			System.out.println(""+num1);
			sum=sum+num1;
		}
		System.out.println("The sum is:"+sum);
		
		
	}

}
