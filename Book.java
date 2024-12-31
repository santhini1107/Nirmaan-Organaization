package day21;

import java.util.Objects;

public class Book implements Comparable<Book> {
	private int id;
	private String title;
	private String author;
	private int copies;
	private double price;
	public Book() {
	}
	public Book(int id,String title, String author, int copies, double price) {
		this.id=id;
		this.title = title;
		this.author = author;
		this.copies = copies;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", copies=" + copies + ", price=" + price
				+ "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return id == other.id;
	}
	@Override
	public int compareTo(Book  other) {
		// TODO Auto-generated method stub
		return Integer.compare(this.id,other.getId());
	}
	
}	
	

