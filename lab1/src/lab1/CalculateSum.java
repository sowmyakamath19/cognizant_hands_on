package lab1;

import java.util.Scanner;

public class CalculateSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		System.out.println("The sum:"+calculateSum(num));
		
		

	}

	private static int calculateSum(int n) {
		int sum=0;
		for (int i=1;i<=n;i++)
		{
			if(i%3==0 && i%5==0) {
				sum+=sum+i;
				
			}
		}
		return sum;
	}

}
