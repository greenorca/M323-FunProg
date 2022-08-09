
public class LB_SQ6A_FriendBuilder {

	String vorname;
	String nachname;
	String augenFarbe;
	String haarFarbe;
	int groesseCm;
	
	public static void main(String[] args) {
		LB_SQ6A_Friend myFriend = new LB_SQ6A_FriendBuilder("Johanna", "Herrlich")
				.mitAugenFarbe("rehbraun")
				.mitKoerperGroesse(170)
				.build();
		System.out.println(myFriend.vorname+" "+myFriend.nachname);
		System.out.println("Augenfarbe:"+ myFriend.augenFarbe+", Grösse: "+myFriend.groesseCm);
	}
	
	public LB_SQ6A_FriendBuilder(String vorname, String nachname) {
		this.vorname = vorname;
		this.nachname = nachname;		
	}
	
	public LB_SQ6A_Friend build() {
		return new LB_SQ6A_Friend(this);
	}
	
	
	public LB_SQ6A_FriendBuilder mitHaarFarbe(String farbe) {
		this.haarFarbe = farbe;
		return this;
	}

	public LB_SQ6A_FriendBuilder mitAugenFarbe(String farbe) {
		this.augenFarbe = farbe;
		return this;
	}

	public LB_SQ6A_FriendBuilder mitKoerperGroesse(int cm) {
		this.groesseCm = cm;
		return this;
	}	
}
