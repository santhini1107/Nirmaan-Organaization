package day9;

import java.util.Scanner;

public class Assessment1 {
	//1.write a java program to cast vote if age is greater than 18?
//	void vote(int age) {
//		
//		if(age>=18) {
//			System.out.println("you are eligible to vote");
//		}
//		else {
//			System.out.println("your are not eligible to vote");
//		}
//	}
//	public static void main(String[]args) {
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Enter your age");
//		int age=scan.nextInt();
//	
//		Assessment1 S=new Assessment1();
//		S.vote(age);
//	}
//}
        
      //2.write a java program to print 1 to 100 such that every 4 multiples should be written as"jack"?
//	void Jack() {
//		for(int i=1;i<=100;i++) {
//			if(i%4==0) {
//				System.out.println("Jack");
//			}
//			else {
//				System.out.println(i);
//			}
//		}
//	}
//	
//	public static void main(String[]args){
//		Assessment1 J=new Assessment1();
//		J.Jack();
//	}
//}
       //3.write a java program to skip odd numbers from 1 to 70?
	
//	void odd() {
//		for(int i=1;i<=70;i++) {
//		if(i%2!=0) {
//			continue;
//		}
//	else {
//		System.out.println(i);
//	}
//	}
//}
//	public static void main(String[]args) {
//		Assessment1 odd=new Assessment1();
//		odd.odd();
//	}
//}
	 //4.write a java program to check a given number is odd or even?
//	void number(int i) {
//		if(i%2==0) {
//			System.out.println("Given number is Even");
//		}
//		else {
//			System.out.println("Given number is Odd");
//		}
//		
//	}
//	public static void main(String[]args) {
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Give one number");
//		int i=scan.nextInt();
//		Assessment1 N=new Assessment1();
//		N.number(i);
//	}
//}

	
	//5.Change given String into Capital and Small Letters?
//	public static void main(String[]args){
//		Scanner Scan=new Scanner(System.in);
//			System.out.println("Enter the String");
//			String Name=Scan.nextLine();
//			System.out.println(Name.toUpperCase());
//			//System.out.println(Name.toLowerCase());
//			
//		
//	}
//}
	   //6.Check if Student's Mark is pass or fail?
//	void vote(int mark) {
//		
//		if(mark>=35) {
//			System.out.println("Student Pass");
//		}
//		else {
//			System.out.println("Student Fail");
//		}
//	}
//	public static void main(String[]args) {
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Enter Student Mark");
//		int mark=scan.nextInt();
//		Assessment1 S=new Assessment1();
//		S.vote(mark);
//	
//	}
//	}	
	      //7.Calculate Total and average Marks Using Scanner?
//	void Student(int mark1,int mark2,int mark3,int mark4,int mark5) {
//		int total=mark1+mark2+mark3+mark4+mark5;
//		System.out.println("Student Total = "+(total));
//		System.out.println("Student Average= "+(total/5));
//	}
//	public static void main(String[]args) {
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Enter your Tamil Mark");
//		int mark1=scan.nextInt();
//		System.out.println("Enter your English Mark");
//		int mark2=scan.nextInt();
//		System.out.println("Enter your Maths Mark");
//		int mark3=scan.nextInt();
//		System.out.println("Enter your Science Mark");
//		int mark4=scan.nextInt();
//		System.out.println("Enter your  Social");
//		int mark5=scan.nextInt();
//		Assessment1 S=new Assessment1();
//		S.Student(mark1,mark2,mark3,mark4,mark5);
//		
//	}
//}
	
	//8.Write a java program  to check given year is leap year or not?
	void leapYear(int year) {
		if(year%4==0) {
			System.out.println("Given year is LeapYear");
		}
		else {
			System.out.println("Given year is not a LeapYear");
		}
		
	}
	public static void main(String[]args){
		Scanner Scan=new Scanner(System.in);
		System.out.println("Enter year");
		int year=Scan.nextInt();
		Assessment1 S=new Assessment1();
     	S.leapYear(year);
		
	}		
}
	
	