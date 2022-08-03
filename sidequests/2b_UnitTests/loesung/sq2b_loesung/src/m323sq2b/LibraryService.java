package m323sq2b;

import java.util.List;
import java.util.stream.Collectors;

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
	 * Diese Methode zählt die Bücher in der Bibliothek und gibt den entsprechenden
	 * Wert zurück.
	 * 
	 * @return Anzahl Bücher in der Bibliothek
	 */
	public long getBookCount() {
		return books.stream().count();
	}

	/**
	 * Diese Methode durchsucht die Bibliothek nach Büchern die nach einem gewissen
	 * Jahr veröffentlicht wurden.
	 * 
	 * @param year Das mindest Jahr der Veröffentlichung
	 * @return Anzahl der veröffentlichten Bücher
	 */
	public long getBooksAfterYear(int year) {
		return books.stream().filter(b -> b.getReleaseYear() >= year).count();
	}

	/**
	 * Diese Methode gibt die Gesamtzahl der verkauften Bücher der Bibliothek
	 * zurück.
	 * 
	 * @return Anzahl verkaufter Bücher
	 */
	public int getOverallBookSells() {
		return books.stream().mapToInt(b -> b.getSoldCopies()).sum();
	}

	/**
	 * Diese Methode liefert die durchschnittliche Anzahl verkaufter Bücher zurück.
	 * 
	 * @return Durchschnittszahl der Verkäufe
	 */
	public double getOverallAverageBookSells() {
		return books.stream().mapToInt(b -> b.getSoldCopies()).average().getAsDouble();
	}

	/**
	 * Gibt das Buch mit den wenigsten Verkäufen zurück.
	 * 
	 * @return Buch mit den wenigsten Verkäufen
	 */
	public Book getLeastSellingBook() {
		return books.stream().reduce((b1, b2) -> b1.getSoldCopies() < b2.getSoldCopies() ? b1 : b2).get();
	}

	/**
	 * Gibt das Buch mit den meisten Verkäufen zurück.
	 * 
	 * @return Buch mit den meisten Verkäufen
	 */
	public Book getMostSellingBook() {
		return books.stream().reduce((b1, b2) -> b1.getSoldCopies() > b2.getSoldCopies() ? b1 : b2).get();
	}

	/**
	 * Gibt die Anzahl Verkäufe für einen bestimmten Author zurück.
	 * 
	 * @param author Auther dessen Verkäufe aufsummiert werden sollen.
	 * @return Anzahl Verkäufe insgesamt des Authors
	 */
	public int getBookSellsForAuthor(String author) {
		return books.stream().filter(b -> b.getAuthor().equals(author)).mapToInt(b -> b.getSoldCopies()).sum();
	}

	/**
	 * Gibt alle Bücher aus welche zwischen zwei angegebenen Jahreszahlen verkauft
	 * wurden.
	 * 
	 * @param minYear Untergrenze der Jahre der Veröffentlichung
	 * @param maxYear Obergrenze der Jahre der Veröffentlichung
	 * @return Liste mit Büchern
	 */
	public List<Book> getSellsBetweenYears(int minYear, int maxYear) {
		return books.stream().filter(b -> b.getReleaseYear() > minYear && b.getReleaseYear() < maxYear)
				.collect(Collectors.toList());
	}

	/**
	 * Diese Methode durchsucht die Bibliothek nach dem ältesten Buch und gibt
	 * dieses zurück
	 * 
	 * @return Ältestes Buch der Bibliothek
	 */
	public Book getOldestBook() {
		return books.stream().reduce((b1, b2) -> b1.getReleaseYear() < b2.getReleaseYear() ? b1 : b2).get();
	}

	/**
	 * Diese Methode sucht nach dem aktuellsten Veröffentlichungsjahr und gibt
	 * dieses zurück.
	 * 
	 * @return Jahr der aktuellsten Veröffentlichung.
	 */
	public int getLatestReleaseYear() {
		return books.stream().mapToInt(b -> b.getReleaseYear()).max().getAsInt();
	}
}
