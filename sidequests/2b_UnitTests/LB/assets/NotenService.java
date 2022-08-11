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
	public List<Note> hole3Besten() {
		return noten.stream()
					.sorted((n1,n2) -> Double.compare(n2.getWert(), n1.getWert())) // 2 pt
					.limit(3) // 1pt
					.toList();
	}

	@Override
	public List<Note> holeNotenSchlechterAls(double notenWert) {
		return noten.stream()
					.filter(n -> n.getWert() < notenWert) // 2 pt
					.toList();
	}

	@Override
	public double holeDurchschnitt() {
		return noten.stream()
					.mapToDouble(n -> n.getWert()) // 1pt
					.average().getAsDouble(); // 1pt
	}
}