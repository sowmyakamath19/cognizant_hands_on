package lab1;

import java.util.Scanner;

public class CalculateDifference {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		System.out.println("The sum:"+calculateDifference(num));

	}
public static int calculateDifference(int n) {
	int sum=0;
	int sumOfN=0,sumOfSquares=0;
	sumOfN=(n*(n+1)/2);
	sumOfSquares=((n*(n+1)*(2*n+1))/6);
	sum=(sumOfN*sumOfN)-sumOfSquares;
	return sum;
}
}
