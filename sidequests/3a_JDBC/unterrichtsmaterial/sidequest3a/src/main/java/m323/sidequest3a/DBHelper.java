package m323.sidequest3a;

import java.util.ArrayList;

/**
 * Diese Klasse kapselt die Logik welche für Datenbankzugriffe verwendet wird
 * @author MSE
 */
public class DBHelper {
	/**
	 * Diese Methode testet die Verbindung zur Datenbank
	 */
	public void connectionTest() {
		System.out.println("App: connectionTest");
		
		// TODO: Code für den Verbindungstest implementieren
	}

	/**
	 * Mittels dieser Methode werden eine Liste von Spiel-Objekten zurückgegeben.
	 */
	public ArrayList<Object> getGames() {
		System.out.println("App: getGames");
		
		ArrayList<Object> games = new ArrayList<Object>();

		// TODO: Object-Typ durch ausprogrammierte Klasse ersetzen
		// TODO: Datenbank-Code für das Auslesen implementieren

		return games;
	}

	/**
	 * Mittels dieser Methode wird ein neues Spiel in die Datenbank hinzugefügt
	 */
	public void addGame(Object game) {
		System.out.println("App: addGame");
		
		// TODO: Datenbank-Code für das Hinzufügen von Objekten implementieren
	}
}
