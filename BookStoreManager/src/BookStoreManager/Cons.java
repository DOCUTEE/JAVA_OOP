package BookStoreManager;

public class Cons extends ALoBooks {
	private Book first;
	private ALoBooks rest;
	public Cons(Book first, ALoBooks rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
	public int count() {
		return 1 + this.rest.count();
	}
	public Book getFirst() {
		return first;
	}
	public void setFirst(Book first) {
		this.first = first;
	}
	public ALoBooks getRest() {
		return rest;
	}
	public void setRest(ALoBooks rest) {
		this.rest = rest;
	}
	protected ALoBooks addBook(Book book) {
		System.out.println(this.getRest().count());
		return new Cons(book,this);
	}
	
}
