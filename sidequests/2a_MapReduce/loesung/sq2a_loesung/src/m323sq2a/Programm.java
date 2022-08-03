package m323sq2a;

import m323sq2a.model.Book;
import m323sq2a.model.Library;

/**
 * Ausfuehrendes Programm des Projektes
 * 
 * @author Patrick Meier
 *
 */
public class Programm {

	public static void main(String[] args) {
		System.out.print("Anzahl Buecher in der Bibliothek: ");
		System.out.println(Library.getBooks().stream().count());

		System.out.print("\nAnzahl Buecher mit Release nach Jahr 2000 in der Bibliothek: ");
		System.out.println(Library.getBooks().stream().filter(b -> b.getReleaseYear() >= 2000).count());

		System.out.print("\nAnzahl verkaufter Buecher: ");
		System.out.println(Library.getBooks().stream().mapToInt(b -> b.getSoldCopies()).sum());

		System.out.print("\nAnzahl im Durchschnitt verkaufter Buecher: ");
		System.out.println(Library.getBooks().stream().mapToInt(b -> b.getSoldCopies()).average().getAsDouble());

		System.out.print("\nBuch mit den wenigsten Verkäufen: ");
		Book buchMitWenigKopien = Library.getBooks().stream()
				.reduce((b1, b2) -> b1.getSoldCopies() < b2.getSoldCopies() ? b1 : b2).get();
		System.out.println(buchMitWenigKopien.getTitle() + " (" + buchMitWenigKopien.getSoldCopies() + " Mio)");

		System.out.print("\nBuch mit den meisten Verkäufen: ");
		Book buchMitVielKopien = Library.getBooks().stream()
				.reduce((b1, b2) -> b1.getSoldCopies() > b2.getSoldCopies() ? b1 : b2).get();
		System.out.println(buchMitVielKopien.getTitle() + " (" + buchMitVielKopien.getSoldCopies() + " Mio)");

		System.out.print("\nAnzahl Verkäufe von J. K. Rowling: ");
		System.out.println(Library.getBooks().stream().filter(b -> b.getAuthor().equals("J. K. Rowling"))
				.mapToInt(b -> b.getSoldCopies()).sum());

		System.out.println("\nAnzahl Verkäufe zwischen den Jahren 1990 und 2000:");
		Library.getBooks().stream().filter(b -> b.getReleaseYear() > 1990 && b.getReleaseYear() < 2000).forEach(b -> {
			System.out.println("- " + b.getTitle() + " (" + b.getSoldCopies() + " Mio) ");
		});

		System.out.print("\nDas älteste Buch: ");
		Book aeltestesBuch = Library.getBooks().stream()
				.reduce((b1, b2) -> b1.getReleaseYear() < b2.getReleaseYear() ? b1 : b2).get();
		System.out.println(aeltestesBuch.getTitle() + " (" + aeltestesBuch.getReleaseYear() + ")");

		System.out.print("\nLetzte Veröffentlichung: ");
		int releaseYear = Library.getBooks().stream().mapToInt(b -> b.getReleaseYear()).max().getAsInt();
		System.out.println(releaseYear);

	}
}
