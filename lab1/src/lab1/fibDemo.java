package lab1;

import java.util.Scanner;

public class fibDemo {

	public static void main(String[] args) {


 
 	Scanner Sc=new Scanner(System.in); 
 	System.out.println("Enter the number of terms: "); 
 	int  num=Sc.nextInt();  	
    int a=0;  	
    int b=1; 
 	System.out.println("Fibonacci series"); 
 
 	System.out.print(""+a);  	
    System.out.print(b+"  ");  	
    for(int i=3;i<num;i++) {  
    	int c=a+b; 
    	System.out.print(c+"  "); 
    	a=b;  	
        b=c;  
 	} 
   } 
} 

	


