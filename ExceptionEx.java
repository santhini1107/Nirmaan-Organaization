package day18;

import java.util.Scanner;

public class ExceptionEx {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		try {
			System.out.println("Enter the a value");
			int a=scan.nextInt();
			System.out.println("Enter the b value");
			int b=scan.nextInt();
			System.out.println("Add:"+(a+b));
			System.out.println("Sub:"+(a-b));
			System.out.println("Mult:"+(a*b));
			System.out.println("Div:"+(a/b));
			System.out.println("Add:"+(a+b));
			System.out.println("Add:"+(a+b));	
		}
		catch(Exception e) {
		System.out.println(e);
		
		}
		
	}

}
