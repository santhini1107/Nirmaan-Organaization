package day15;

import java.util.Scanner;
public class UserInterface {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	Calculator calc=new Calculator();
	System.out.println("Enter a value");
	int a=scan.nextInt();
	System.out.println("Enter b value");
	int b=scan.nextInt();
	System.out.println("Addition :"+calc.add(a,b));
	System.out.println("Subtract :"+calc.sub(a,b));
	System.out.println("Multply  :"+calc.mult(a,b));
	System.out.println("Division :"+calc.div(a,b) );
	System.out.println("Modulus  :"+calc.mud(a,b) );

	}
}
