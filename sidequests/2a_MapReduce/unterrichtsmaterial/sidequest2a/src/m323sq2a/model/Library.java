package m323sq2a.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Wrapper-Klasse um Buecher bereitzustellen
 * 
 * @author Patrick Meier
 *
 */
public class Library {

	private static List<Book> books = new ArrayList<Book>();

	public Library() {

	}

	/**
	 * Gibt eine Liste mit Buechern zurück. Falls der interene Speicher für Buecher
	 * noch nicht initialisiert wurde, wird dies zuerst ausgeführt.
	 * 
	 * @return Eine Liste mit Buechern
	 */
	public static List<Book> getBooks() {
		if (books.size() == 0) {
			initializeBooks();
		}

		return books;
	}

	/**
	 * Methode zum initialisieren der Bibliothek. Neue Buecher sollen darin erfasst
	 * werden.
	 */
	private static void initializeBooks() {
		books.add(new Book("A Game of Thrones", 1996));
		books.add(new Book("The Colour of Magic", 1983));
		books.add(new Book("The Lord of the Rings", 1954));
		books.add(new Book("Jonathan Strange & Mr Norrel", 2004));
		books.add(new Book("The Name of the Wind", 2007));
		books.add(new Book("The Lies of Locke Lamora", 2006));
		books.add(new Book("American Gods", 2001));
		books.add(new Book("The Fifth Season", 2015));
		books.add(new Book("The Earthsea Quartet", 1993));
		books.add(new Book("Assassin's Apprentice", 1995));
	}
}
