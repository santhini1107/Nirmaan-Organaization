package Day5;

import java.util.Scanner;

public class StringConcpt {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your name");
		String Name=scan.nextLine();
		System.out.println(Name.substring(0, 8));
		System.out.println(Name.charAt(9));
	}
}
