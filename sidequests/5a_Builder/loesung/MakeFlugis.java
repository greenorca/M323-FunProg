
public class MakeFlugis {

	public static void main(String[] args) {
		
		FlugzeugBuilder myFlugiBuilder = new FlugzeugBuilder("Cesna 172", 2, 736)
				.setGeschwindigkeit(302)
				.setReichweite(1270);
		Flugzeug myFlugi = myFlugiBuilder.build();		
		System.out.println(myFlugi);
		
		Flugzeug airbus = new FlugzeugBuilder("Airbus A300", 2, 8200)
				.setPassagiere(266)
				.setReichweite(6000)
				.build();
		System.out.println(airbus);
	}

}
