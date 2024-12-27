package day21;

import java.util.ArrayList;
import java.util.Scanner;

public class BookInterface {
	public static void main(String[] args) {
		Book book=new Book();
		ArrayList<Book> al=new ArrayList<Book>();
		Scanner scan=new Scanner(System.in);
		boolean work=true;
		while(work) {
		System.out.println("Enter your choice");
		System.out.println("1 for Add :");
		System.out.println("2 for Update :");
		System.out.println("3 for Show :");
		System.out.println("4 for Remove");
		System.out.println("0 for Exit");
		int key=scan.nextInt();
		scan.nextLine();
		if(key==1) {
			System.out.println("Enter book Id");
			int id=scan.nextInt();
			scan.nextLine();
			System.out.println("Enter Book Title");
			String title=scan.nextLine();
			System.out.println("Enter Author Name ");
			String author=scan.nextLine();
			System.out.println("Enter copies of Book ");
			int copies=scan.nextInt();
			System.out.println("Enter Book price");
			double price=scan.nextDouble();
			al.add(book=new Book(id,title, author, copies, price));
		}
		else if(key==2) {
			System.out.println("Enter the Book ID");
			int id=scan.nextInt();
			boolean isTrue=false;
			for(Book book1:al) {
				
				if(id==book1.getId()) {
					System.out.println("Enter Book Name");
					String title=scan.nextLine();
					book1.setTitle(title);
					System.out.println("Enter Author Name ");
					String author=scan.nextLine();
					book1.setAuthor(author);
					System.out.println("Enter copies of Book ");
					int copies=scan.nextInt();
					book1.setCopies(copies);
					System.out.println("Enter Book price");
					double price=scan.nextDouble();
					book1.setPrice(price);
					break;
				}
			
			}
			if(!isTrue) {
				System.out.println("Book not there");
			}
		}
		else if(key==3) {
			System.out.println(al);
		}
		else if(key==4) {
			System.out.println("Enter the Book Id");
			int id=scan.nextInt();
			for(Book book1:al) {
				if(id==book1.getId()) {
					al.remove(book1);
					}
				}
				
	    }
		else if(key==0) {
			work=false;
			System.out.println("Program Stoped");

        }
		else {
			work=false;
			System.out.println("Enter the correct choice");
		}
    }
}
}