package lab1;

import java.util.Scanner;

public class PrimeDemo {

	public static void main(String[] args) {
		int num,p;
	System.out.println("Enter the integer");
	Scanner s=new Scanner(System.in);
	num=s.nextInt();
	for(int i=2;i<=num;i++) {
		p=1;
		for(int j=2;j<i;j++) {
		if(i%j==0) {
			p=0;
		}
		
	}
		if(p==1)
			System.out.println("prime:"+i);
	}

}
}
