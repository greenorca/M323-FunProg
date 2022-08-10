/**
 * Klasse zur Speicherung von Freund-Daten
 * @author wiss2022 (SCSV)
 *
 */
public class LB_SQ6A_Friend {
	
	String vorname;
	String nachname;
	String augenFarbe;
	String haarFarbe;
	int groesseCm;
	
	/**
	 * TODO: Konstruktor komplettieren 
	 * @param builder
	 */
	LB_SQ6A_Friend(LB_SQ6A_FriendBuilder builder) {
		vorname = builder.vorname;
		nachname = builder.nachname;
		augenFarbe = builder.augenFarbe;
		haarFarbe = builder.haarFarbe;
		groesseCm = builder.groesseCm;		
	}	
}
