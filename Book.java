package day12;

public class Book {
	private String title;
	private String author;
	private double price;
	private int numberOfCopies;
	Book(){
		
	}
	Book(String title,String author,double price,int numberOfCopies){
		this.title=title;
		this.author=author;
		this.price=price;
		this.numberOfCopies=numberOfCopies;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public double getPrice() {
		return price;
	}
	public int getNumberOfCopies() {
		return numberOfCopies;
	}
	public void setTitle(String title) {
		this.title=title;
	}
	public void setAuthor(String author) {
		this.author=author;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	
	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies=numberOfCopies;
	}
	public String toString() {
		return "Title  = "+title+"\nAuthor = "+author+"\nPrice  = "+price+"\nCopies = "+numberOfCopies;
	}
	

}
