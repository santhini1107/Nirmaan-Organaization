package Day3;

import java.util.Scanner;

public class NestedIf {
	public static void main(String[]args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter your mark");
	int mark=scan.nextInt();
	if(mark>=35) {
		if(mark>=90) {
			System.out.println("your grade is A");
		}
		else if(mark>=70) {
			System.out.println("your grade is B");
		}
		else if(mark>=50) {
			System.out.println("your grade is C");
		}
		
	}
	else {
		System.out.println("fail");
	}
	
	}
}
