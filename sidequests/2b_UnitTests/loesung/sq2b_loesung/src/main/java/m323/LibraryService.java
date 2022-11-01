package m323;

import java.util.List;
import java.util.stream.Collectors;

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
	 * Diese Methode z�hlt die B�cher in der Bibliothek und gibt den entsprechenden
	 * Wert zur�ck.
	 * 
	 * @return Anzahl B�cher in der Bibliothek
	 */
	public long getBookCount() {
		return books.stream().count();
	}

	/**
	 * Diese Methode durchsucht die Bibliothek nach B�chern die nach einem gewissen
	 * Jahr ver�ffentlicht wurden.
	 * 
	 * @param year Das mindest Jahr der Ver�ffentlichung
	 * @return Anzahl der ver�ffentlichten B�cher
	 */
	public long getBooksAfterYear(int year) {
		return books.stream().filter(b -> b.getReleaseYear() >= year).count();
	}

	/**
	 * Diese Methode gibt die Gesamtzahl der verkauften B�cher der Bibliothek
	 * zur�ck.
	 * 
	 * @return Anzahl verkaufter B�cher
	 */
	public int getOverallBookSells() {
		return books.stream().mapToInt(b -> b.getSoldCopies()).sum();
	}

	/**
	 * Diese Methode liefert die durchschnittliche Anzahl verkaufter B�cher zur�ck.
	 * 
	 * @return Durchschnittszahl der Verk�ufe
	 */
	public double getOverallAverageBookSells() {
		return books.stream().mapToInt(b -> b.getSoldCopies()).average().getAsDouble();
	}

	/**
	 * Gibt das Buch mit den wenigsten Verk�ufen zur�ck.
	 * 
	 * @return Buch mit den wenigsten Verk�ufen
	 */
	public Book getLeastSellingBook() {
		return books.stream().reduce((b1, b2) -> b1.getSoldCopies() < b2.getSoldCopies() ? b1 : b2).get();
	}

	/**
	 * Gibt das Buch mit den meisten Verk�ufen zur�ck.
	 * 
	 * @return Buch mit den meisten Verk�ufen
	 */
	public Book getMostSellingBook() {
		return books.stream().reduce((b1, b2) -> b1.getSoldCopies() > b2.getSoldCopies() ? b1 : b2).get();
	}

	/**
	 * Gibt die Anzahl Verk�ufe f�r einen bestimmten Author zur�ck.
	 * 
	 * @param author Auther dessen Verk�ufe aufsummiert werden sollen.
	 * @return Anzahl Verk�ufe insgesamt des Authors
	 */
	public int getBookSellsForAuthor(String author) {
		return books.stream().filter(b -> b.getAuthor().equals(author)).mapToInt(b -> b.getSoldCopies()).sum();
	}

	/**
	 * Gibt alle B�cher aus welche zwischen zwei angegebenen Jahreszahlen verkauft
	 * wurden.
	 * 
	 * @param minYear Untergrenze der Jahre der Ver�ffentlichung
	 * @param maxYear Obergrenze der Jahre der Ver�ffentlichung
	 * @return Liste mit B�chern
	 */
	public List<Book> getSellsBetweenYears(int minYear, int maxYear) {
		return books.stream().filter(b -> b.getReleaseYear() > minYear && b.getReleaseYear() < maxYear)
				.collect(Collectors.toList());
	}

	/**
	 * Diese Methode durchsucht die Bibliothek nach dem �ltesten Buch und gibt
	 * dieses zur�ck
	 * 
	 * @return �ltestes Buch der Bibliothek
	 */
	public Book getOldestBook() {
		return books.stream().reduce((b1, b2) -> b1.getReleaseYear() < b2.getReleaseYear() ? b1 : b2).get();
	}

	/**
	 * Diese Methode sucht nach dem aktuellsten Ver�ffentlichungsjahr und gibt
	 * dieses zur�ck.
	 * 
	 * @return Jahr der aktuellsten Ver�ffentlichung.
	 */
	public int getLatestReleaseYear() {
		return books.stream().mapToInt(b -> b.getReleaseYear()).max().getAsInt();
	}
}
