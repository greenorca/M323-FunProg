package m323.sidequest3a;

/**
 * Modelklasse für Spiele
 * 
 * @author Patrick Meier
 *
 */
public class Spiel {
	private int id;
	private String titel;
	private String genre;
	private float preis;

	public Spiel() {
	}

	public Spiel(String titel, String genre, float preis) {
		this.titel = titel;
		this.genre = genre;
		this.preis = preis;
	}

	public Spiel(int id, String titel, String genre, float preis) {
		this(titel, genre, preis);

		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public float getPreis() {
		return preis;
	}

	public void setPreis(float preis) {
		this.preis = preis;
	}
}
