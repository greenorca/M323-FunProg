package m323sq2a.model;

/**
 * Modelklasse für Buch Objekte
 * 
 * @author Patrick Meier
 *
 */
public class Book {
	private String title;
	private int releaseYear;

	public Book(String title, int releaseYear) {
		this.title = title;
		this.releaseYear = releaseYear;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
