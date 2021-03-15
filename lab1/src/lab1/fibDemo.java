package lab1;

import java.util.Scanner;

public class fibDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int fib0=0,fib1=1,fib;
		for(int i=3;i<=num;i++) {
			fib=fib1+fib0;
			fib1=fib;
			fib0=fib1;
			System.out.println(""+fib);
			
		}
	}

}
