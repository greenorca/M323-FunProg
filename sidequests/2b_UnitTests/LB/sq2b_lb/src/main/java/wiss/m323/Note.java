package wiss.m323;

/**
 * Dies Klasse bildet eine Modul zu Noten Beziehung ab.
 * 
 * @author Patrick Meier
 *
 */
public class Note {

	/**
	 * Modul fuer welches die Note gilt.
	 */
	private String modul;

	/**
	 * Wert der Note (von 1-6)
	 */
	private double wert;

	public Note(String modul, double wert) {
		this.modul = modul;
		this.wert = wert;
	}

	public String getModul() {
		return modul;
	}

	public double getWert() {
		return wert;
	}
}