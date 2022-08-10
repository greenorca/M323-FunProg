package wiss.m323;

import java.util.List;

/**
 * Effektive Implementation des Notenservice.
 * 
 * @author Patrick Meier
 *
 */
public class NotenService implements INotenService {

	private List<Note> noten;

	/**
	 * Initialisiert den Service mit einer vorgegebenen Liste von Noten.
	 * 
	 * @param noten Liste der Noten, die der Service verwenden wird.
	 */
	public NotenService(List<Note> noten) {
		this.noten = noten;
	}

	/**
	 * Gibt alle im service befindlichen Noten zurueck;
	 * 
	 * @return Liste aller Noten
	 */
	public List<Note> holeAlle() {
		return noten;
	}

	@Override
	public List<Note> hole5Besten() {

		// TODO: verfasse hier den funktionalen Code

		return null;
	}

	@Override
	public List<Note> holeNotenSchlechterAls(double notenWert) {

		// TODO: verfasse hier den funktionalen Code

		return null;
	}

	@Override
	public double holeDurchschnitt() {

		// TODO: verfasse hier den funktionalen Code

		return 0;
	}
}