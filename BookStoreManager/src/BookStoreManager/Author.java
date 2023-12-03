package BookStoreManager;

public class Author {
	private String name;
	private int birthYear;
	private ALoBooks books;
	public Author(String name, int birthYear, ALoBooks books) {
		this.name = name;
		this.birthYear = birthYear;
		this.books = books;
		
	}
	public int numberOfBooks(){
		return this.books.count();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public ALoBooks getBooks() {
		return books;
	}
	public void setBooks(ALoBooks books) {
		this.books = books;
	}
	public void addBook(Book book) {
		this.books = new Cons(book, this.books);
	}
}
