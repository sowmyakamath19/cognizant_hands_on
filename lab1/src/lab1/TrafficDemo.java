package lab1;

import java.util.Scanner;

public class TrafficDemo {

	public static void main(String[] args) {
	
		System.out.println("Enter choice of Traffic light:");
		Scanner s=new Scanner(System.in); 
		String light=s.next();
		if (light.equals("red")) {
			System.out.println("stop");
		}
		else if(light.equals("yellow"))
				System.out.println("ready");
		else
				System.out.println("go");
		}

	}


