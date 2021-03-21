import java.util.Scanner;

public class replaceConsonant {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String st=sc.next();
		System.out.println("The altered string is:"+alterString(st));

	}
public static String alterString(String str) {
	String altStr="";
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
			altStr+=str.charAt(i);
		}
			else
			{
				char asci=(char)((char) str.charAt(i)+1);
				altStr+=asci;
			}
		
			}
			return altStr;
			
		
	}
	
	
}

