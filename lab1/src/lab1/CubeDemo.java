package lab1;
import java.util.Scanner;
public class CubeDemo {

	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		cubeSum(num);

	}

	private static void cubeSum(int num) {
		int digit,sum=0;
		
		while(num!=0) {
			digit=num%10;
			sum=sum+digit*digit*digit;
			num=num/10;
		}
		System.out.println("Sum of cube:"+sum);
		
	}

}
