import java.util.Scanner;

public class StringMirror {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:E");
		String str=sc.next();
		System.out.println("The mirror image"+getImage(str));
		
		
	}
		
		public static String getImage(String s) {
			
			StringBuffer st=new StringBuffer(s);
			st.reverse();
			return s+'|'+st;
			 }
		

}	
