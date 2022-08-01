package m323.sidequest3a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Diese Klasse kapselt die Logik welche für Datenbankzugriffe verwendet wird
 * 
 * @author Patrick Meier
 */
public class DBHelper {
	// JDBC driver name and database URL
	final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	final String DB_URL = "jdbc:mysql://localhost/m323_sq3a";

	// Database credentials
	final String USER = "root";
	final String PASS = "root";

	/**
	 * Diese Methode testet die Verbindung zur Datenbank
	 */
	public void connectionTest() {
		System.out.println("App: connectionTest");

		try {
			Class.forName(JDBC_DRIVER);

			// Open a database connect
			Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
			con.close();

			System.out.println("Verbindungstest erfolgreich.");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("!!! Verbindungstest fehlgeschlagen wegen Ausnahmefehler:");
			e.printStackTrace();
		}
	}

	/**
	 * Mittels dieser Methode werden eine Liste von Spiel-Objekten zurückgegeben.
	 */
	public ArrayList<Spiel> getGames() {
		System.out.println("App: getGames");

		ArrayList<Spiel> games = new ArrayList<Spiel>();

		try {
			Class.forName(JDBC_DRIVER);

			// Open a database connect
			Connection dbConnection = DriverManager.getConnection(DB_URL, USER, PASS);
			PreparedStatement statement = dbConnection.prepareStatement("SELECT * FROM spiel");
			ResultSet resultSet = statement.executeQuery();

			while (resultSet.next()) {
				Spiel eintrag = new Spiel(resultSet.getInt("id"), resultSet.getString("titel"),
						resultSet.getString("genre"), resultSet.getFloat("preis"));
				games.add(eintrag);
			}

			resultSet.close();
			statement.close();
			dbConnection.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return games;
	}

	/**
	 * Mittels dieser Methode wird ein neues Spiel in die Datenbank hinzugefügt
	 */
	public void addGame(Spiel game) {
		System.out.println("App: addGame");

		try {
			Class.forName(JDBC_DRIVER);

			// Open a database connect
			Connection dbConnection = DriverManager.getConnection(DB_URL, USER, PASS);
			PreparedStatement statement = dbConnection
					.prepareStatement("INSERT INTO spiel (titel,genre,preis) VALUES(?,?,?);");
			statement.setString(1, game.getTitel());
			statement.setString(2, game.getGenre());
			statement.setFloat(3, game.getPreis());

			statement.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
