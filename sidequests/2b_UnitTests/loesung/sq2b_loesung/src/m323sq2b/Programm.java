package m323sq2b;

import m323sq2b.model.Book;
import m323sq2b.model.Library;

/**
 * Ausfuehrendes Programm des Projektes
 * 
 * @author Patrick Meier
 *
 */
public class Programm {

	static LibraryService libService = new LibraryService(Library.getBooks());

	public static void main(String[] args) {

		System.out.print("Anzahl Buecher in der Bibliothek: ");
		System.out.println(libService.getBookCount());

		System.out.print("\nAnzahl Buecher mit Release nach Jahr 2000 in der Bibliothek: ");
		System.out.println(libService.getBooksAfterYear(2000));

		System.out.print("\nAnzahl verkaufter Buecher: ");
		System.out.println(libService.getOverallBookSells());

		System.out.print("\nAnzahl im Durchschnitt verkaufter Buecher: ");
		System.out.println(libService.getOverallAverageBookSells());

		Book buchMitWenigKopien = libService.getLeastSellingBook();
		System.out.print("\nBuch mit den wenigsten Verkäufen: ");
		System.out.println(buchMitWenigKopien.getTitle() + " (" + buchMitWenigKopien.getSoldCopies() + " Mio)");

		Book buchMitVielKopien = libService.getMostSellingBook();
		System.out.print("\nBuch mit den meisten Verkäufen: ");
		System.out.println(buchMitVielKopien.getTitle() + " (" + buchMitVielKopien.getSoldCopies() + " Mio)");

		System.out.print("\nAnzahl Verkäufe von J. K. Rowling: ");
		System.out.println(libService.getBookSellsForAuthor("J. K. Rowling"));

		System.out.println("\nAnzahl Verkäufe zwischen den Jahren 1990 und 2000:");
		libService.getSellsBetweenYears(1990, 2000).forEach(b -> {
			System.out.println("- " + b.getTitle() + " (" + b.getSoldCopies() + " Mio) ");
		});

		Book aeltestesBuch = libService.getOldestBook();
		System.out.print("\nDas älteste Buch: ");
		System.out.println(aeltestesBuch.getTitle() + " (" + aeltestesBuch.getReleaseYear() + ")");

		System.out.print("\nLetzte Veröffentlichung: ");
		System.out.println(libService.getLatestReleaseYear());
	}
}
