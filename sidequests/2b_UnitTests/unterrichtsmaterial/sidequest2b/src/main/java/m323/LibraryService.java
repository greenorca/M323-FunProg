package m323;

import java.util.List;

import m323.model.Book;

/**
 * Diese Klasse standardisiert die Zugriffe auf die Bibliothek via
 * entsprechenden Methoden.
 * 
 * @author Patrick Meier
 *
 */
public class LibraryService {
	private List<Book> books;

	public LibraryService(List<Book> expectedBooks) {
		this.books = expectedBooks;
	}

	/**
	 * Diese Methode erlaubt den direkten Zugriff auf die im Service registrierten
	 * B�cher.
	 * 
	 * @return Liste mit B�chern
	 */
	public List<Book> getBooks() {
		return books;
	}

	/**
	 * Diese Methode z�hlt die B�cher in der Bibliothek und gibt den entsprechenden Wert zur�ck.
	 * @return Anzahl B�cher in der Bibliothek
	 */
	public long getBookCount() {
		return books.stream().count();
	}
	
	// TODO: hier kommen die weiteren Methoden hinzu
}
