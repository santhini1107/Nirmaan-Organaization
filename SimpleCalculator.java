package Day2;

import java.util.Scanner;

public class SimpleCalculator {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your choice");
		System.out.println("0 for add");
		System.out.println("1 for sub");
		System.out.println("2 for mult");
		System.out.println("3 for div");
		System.out.println("4 for mod");
		int key=scan.nextInt();
		
//		if(key==0) {
//			System.out.println("Addition");
//			System.out.println("Enter the first number ");
//			int FirstNum=scan.nextInt();
//			System.out.println("Enter the second number");
//			int SecondNum=scan.nextInt();
//			int Total=FirstNum+SecondNum;
//		System.out.println(Total);
//		}	
//		else if(key==1) {
//			System.out.println("SubStaction");
//			System.out.println("Enter the first number ");
//			int FirstNum=scan.nextInt();
//			System.out.println("Enter the second number");
//			int SecondNum=scan.nextInt();
//			int Total=FirstNum-SecondNum;
//		System.out.println(Total);
//		}
//		else if(key==2) {
//			System.out.println("multipication");
//			System.out.println("Enter the first number ");
//			int FirstNum=scan.nextInt();
//			System.out.println("Enter the second number");
//			int SecondNum=scan.nextInt();
//			int Total=FirstNum*SecondNum;
//		System.out.println(Total);
//		}
//		else if(key==3) {
//			System.out.println("Division");
//			System.out.println("Enter the first number ");
//			int FirstNum=scan.nextInt();
//			System.out.println("Enter the second number");
//			int SecondNum=scan.nextInt();
//			int Total=FirstNum/SecondNum;
//		System.out.println(Total);
//		}
//		else if(key==4) {
//			System.out.println("modulus");
//			System.out.println("Enter the first number ");
//			int FirstNum=scan.nextInt();
//			System.out.println("Enter the second number");
//			int SecondNum=scan.nextInt();
//			int Total=FirstNum%SecondNum;
//		System.out.println(Total);
//		}
//		else {
//			System.out.println("Enter the correct choice");
//		}
		
	switch (key) {
	case 0: {
		System.out.println("Addition");
		System.out.println("Enter the first number ");
		int FirstNum=scan.nextInt();
		System.out.println("Enter the second number");
		int SecondNum=scan.nextInt();
		int Total=FirstNum+SecondNum;
		System.out.println(Total);
		break;
	}
	case 1:{
		System.out.println("SubStaction");
		System.out.println("Enter the first number ");
		int FirstNum=scan.nextInt();
		System.out.println("Enter the second number");
		int SecondNum=scan.nextInt();
		int Total=FirstNum-SecondNum;
		System.out.println(Total);
		break;
	}
	case 2:{
		System.out.println("Muliplication");
		System.out.println("Enter the first number ");
		int FirstNum=scan.nextInt();
		System.out.println("Enter the second number");
		int SecondNum=scan.nextInt();
		int Total=FirstNum*SecondNum;
		System.out.println(Total);
		break;
	}
	case 3:{
		System.out.println("Division");
		System.out.println("Enter the first number ");
		int FirstNum=scan.nextInt();
		System.out.println("Enter the second number");
		int SecondNum=scan.nextInt();
		int Total=FirstNum/SecondNum;
		System.out.println(Total);
		break;
	}
	case 4:{
		System.out.println("Modulous");
		System.out.println("Enter the first number ");
		int FirstNum=scan.nextInt();
		System.out.println("Enter the second number");
		int SecondNum=scan.nextInt();
		int Total=FirstNum%SecondNum;
		System.out.println(Total);
		break;	
	}
		
		
	
	default:
		System.out.println("Enter the correct choice");
	}
	
		}
	
	
	
	
	
	}
	
	
	
	

