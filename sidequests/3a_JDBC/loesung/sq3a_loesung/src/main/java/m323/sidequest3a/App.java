package m323.sidequest3a;

import java.util.ArrayList;

/**
 * Ausführender Programmcode
 * 
 * @author Patrick Meier
 */
public class App {
	private static DBHelper dbhelper = new DBHelper();

	public static void main(String[] args) {
		System.out.println("App: Start");

		// Verbindungstest durchführen
		dbhelper.connectionTest();

		// Spiele hinzufügen
		dbhelper.addGame(new Spiel("Frostpunk", "Aufbaustrategie", 45));
		dbhelper.addGame(new Spiel("Mortal Kombat", "Beat em up", 10));
		dbhelper.addGame(new Spiel("Assassin's Creed", "Action Adventure", 20));

		// Spiele anzeigen
		ArrayList<Spiel> spiele = dbhelper.getGames();
		for(Spiel spiel : spiele) {
			System.out.print("ID: "+spiel.getId());
			System.out.print("\tTitel: "+spiel.getTitel());
			System.out.print("\tGenre: "+spiel.getGenre());
			System.out.println("\tPreis: "+spiel.getPreis());
		}

		System.out.println("App: Ende");
	}
}
