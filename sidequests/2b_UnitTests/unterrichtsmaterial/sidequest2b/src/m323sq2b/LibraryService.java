package m323sq2b;

import java.util.List;

import m323sq2b.model.Book;

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
	 * Bücher.
	 * 
	 * @return Liste mit Büchern
	 */
	public List<Book> getBooks() {
		return books;
	}

	/**
	 * Diese Methode zählt die Bücher in der Bibliothek und gibt den entsprechenden Wert zurück.
	 * @return Anzahl Bücher in der Bibliothek
	 */
	public long getBookCount() {
		return books.stream().count();
	}
	
	// TODO: hier kommen die weiteren Methoden hinzu
}
