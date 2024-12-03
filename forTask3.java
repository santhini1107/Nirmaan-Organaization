package day7;

import java.util.Scanner;

//how to reverse a string
public class forTask3 {
	public static void main(String[]args) {
//		String name="santhini";
//		for(int i=7;i>=0;i--) {
//			System.out.print(name.charAt(i));
//		}
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=scan.nextLine();
		int n=name.length();
		for(int i=n-1;i>=0;i--) {
			System.out.print(name.charAt(i));
		}
	}

}
