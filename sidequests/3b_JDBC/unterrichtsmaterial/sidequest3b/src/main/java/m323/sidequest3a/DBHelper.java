package m323.sidequest3a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * This class handles all the database access for loading and writing to
 * database.
 * 
 * @author Patrick Meier
 */
public class DBHelper {
	// JDBC driver name and database URL
	final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	final String DB_URL = "jdbc:mysql://localhost/m323_sq3b";

	// Database credentials
	final String USER = "root";
	final String PASS = "root";

	/**
	 * This member compiles a list of game objects directly from the database.
	 * 
	 * @return a list of Game objects
	 */
	public ArrayList<Game> getGames() {
		System.out.println("App: getGames");

		ArrayList<Game> games = new ArrayList<Game>();

		try {
			Class.forName(JDBC_DRIVER);

			// Open a database connect
			Connection dbConnection = DriverManager.getConnection(DB_URL, USER, PASS);
			PreparedStatement statement = dbConnection.prepareStatement("SELECT * FROM game");
			ResultSet resultSet = statement.executeQuery();

			while (resultSet.next()) {
				Game eintrag = new Game(resultSet.getInt("id"), resultSet.getString("title"),
						resultSet.getString("genre"), resultSet.getFloat("price"), resultSet.getDate("releaseDate"));
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
}
