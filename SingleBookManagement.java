package day12;

import java.util.Scanner;

public class SingleBookManagement {
	static Book book;
	public static void main (String[]args) {
		Book book=new Book();
		Scanner scan=new Scanner(System.in);
		boolean isTrue=true;
		while(isTrue) {
		System.out.println("Enter your choice");
		System.out.println("1 for Add");
		System.out.println("2 for Update");
		System.out.println("3 for Display");
		System.out.println("4 for Exit");
		int key=scan.nextInt();
		scan.nextLine();
		
			switch (key) {
			case 1: {
				System.out.println("Enter your title");
				String title=scan.nextLine();
				System.out.println("Enter your Author");
				String author=scan.nextLine();
				System.out.println("Enter your Price");
				double price=scan.nextDouble();
				System.out.println("Enter your Number of Copies");
				int numberOfCopies=scan.nextInt();
				book=new Book(title, author, price,numberOfCopies);
				break;
				
			}
			case 2: {
				System.out.println("Enter title");
				String title=scan.nextLine();
				book.setTitle(title);
				System.out.println("Enter Author");
				String author=scan.nextLine();
				book.setAuthor(author);
				System.out.println("Enter Price");
				double price=scan.nextDouble();
				book.setPrice(price);
				System.out.println("Enter Number of Copies");
				int numberOfCopies=scan.nextInt();
				book.setNumberOfCopies(numberOfCopies);
				break;
				
			}
			case 3:{
				System.out.println(book);
				break;
			}
			case 4:{
				isTrue=false;
				System.out.println("Thank you");
				break;
			}
				
			default:
				System.out.println("Enter the correct choice");
				break;
			}
				
			}
			
		}
	}


