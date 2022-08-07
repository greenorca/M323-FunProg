import java.util.Optional;

public class Flugzeug {
	
	private String typ;
	private int besatzung;
	private int leergewicht;
	private Optional<Integer> reichweite;
	private Optional<Integer> geschwindigkeit;
	private Optional<Integer> passagiere;
	
	Flugzeug(FlugzeugBuilder builder) {
		this.typ = builder.typ;
		besatzung = builder.besatzung;
		reichweite = builder.reichweite;
		geschwindigkeit = builder.geschwindigkeit;
		passagiere = builder.passagiere;
	}
	
	@Override
	public String toString() {
		String result = String.format("Flugi: %s: Crew: %d, Gewicht: %d", 
				this.typ, this.besatzung, this.leergewicht);
		
		if (geschwindigkeit.isPresent()) {
			result += String.format(", Geschwindigkeit: ", geschwindigkeit.get());
		}
		
		if (reichweite.isPresent()) {
			result += String.format(", Reichweite: %d km",reichweite.get());
		}
		
		if (passagiere.isPresent()) {
			result += String.format(", Passagiere: %d",passagiere.get());
		}
		
		return result;
	}

}
