package wiss.m323;

import java.util.List;

/**
 * Interface welches die Methoden des {@link NotenService} exponiert.
 * 
 * @author Patrick Meier
 *
 */
public interface INotenService {

	/**
	 * Gibt die 5 besten Noten zurueck.
	 * 
	 * @return Liste mit den 5 besten Noten;
	 */
	List<Note> hole5Besten();

	/**
	 * Gibt alle Noten unterhalb eines bestimmten Wertes (dieser ausgeschlossen)
	 * zurueck.
	 * 
	 * @param notenWert Wert welcher die obere Grenze angibt
	 * @return List mit Noten, welche einen gewissen Wert nicht uebersteigen.
	 */
	List<Note> holeNotenSchlechterAls(double notenWert);

	/**
	 * Gibt den Durchschnittswert aller Noten zurueck.
	 * 
	 * @return Durchschnittswert aller Noten;
	 */
	double holeDurchschnitt();
}