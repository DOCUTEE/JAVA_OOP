package BookStoreManager;

public class Empty extends ALoBooks {
	public int count() {
		return 0;
	}

	@Override
	protected ALoBooks addBook(Book book) {
		return new Cons(book,new Empty());
	}
}
