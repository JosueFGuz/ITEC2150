
public class Book {
	private String name;
	private String nameBook;
	private boolean isRegistered;
	private boolean moreBooks;
	
	
	public Book(String nameBook, boolean isRegistered, boolean moreBooks, double balance) {
		super();
		this.nameBook = nameBook;
		this.isRegistered = isRegistered;
		this.moreBooks = moreBooks;
		this.name = name;
		
	}

	public String getNameBook() {
		return nameBook;
	}

	public boolean isRegistered() {
		return isRegistered;
	}

	public boolean isMoreBooks() {
		return moreBooks;
	}
	
	public String toString() {
		return "Book checkout: Name = " + name + ", said " + isRegistered + " to being registered, " + moreBooks + "on wanting to register more books"; 
	}

}
