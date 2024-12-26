package day21;

public class Book {
	private String title;
	private String author;
	private int copies;
	private double price;
	public Book() {
	}
	public Book(String title, String author, int copies, double price) {
		this.title = title;
		this.author = author;
		this.copies = copies;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getCopies() {
		return copies;
	}
	public void setCopies(int copies) {
		this.copies = copies;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Title :" + title + "\nAuthor :" + author + "\nCopies :" + copies + "\nPrice :" + price ;
	}
	
	
}
