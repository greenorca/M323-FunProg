import java.util.Optional;

public class FlugzeugBuilder {

	String typ;
	int besatzung;
	int leergewicht;
	Optional<Integer> reichweite;
	Optional<Integer> geschwindigkeit;
	Optional<Integer> passagiere;
	
	public FlugzeugBuilder(String typ, int besatzung, int leergewicht) {
		
		this.typ = typ;
		this.besatzung = besatzung;
		this.leergewicht = leergewicht;
	
		reichweite = Optional.empty();
		geschwindigkeit = Optional.empty();
		passagiere = Optional.empty();
	}
	
	public FlugzeugBuilder setGeschwindigkeit(int geschwindigkeit) {
		this.geschwindigkeit = Optional.of(geschwindigkeit);
		return this;
	}
	
	public FlugzeugBuilder setPassagiere(int passagiere) {
		this.passagiere = Optional.of(passagiere);
		return this;
	}
	
	public FlugzeugBuilder setReichweite(int reichweite) {
		this.reichweite = Optional.of(reichweite);
		return this;
	}
	
	public Flugzeug build() {
		return new Flugzeug(this);
	}

}
