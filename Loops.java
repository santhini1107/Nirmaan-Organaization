package Day3;

import java.util.Scanner;

public class Loops {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int table=scan.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println((table+"x"+i+"="+i*table));	
		}
		System.out.println("Tables");
	}

}
