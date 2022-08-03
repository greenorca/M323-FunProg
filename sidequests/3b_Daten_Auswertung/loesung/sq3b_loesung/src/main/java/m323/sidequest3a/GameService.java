package m323.sidequest3a;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GameService {
	private GameDao gameDao = new GameDao();

	/**
	 * Sucht nach dem Spiel mit dem niedrigsten Preis.
	 * 
	 * @return Spiel mit dem niedrigsten Preis
	 */
	public Game getCheapestGame() {
		return gameDao.getGames().stream().reduce((g1, g2) -> g1.getPrice() < g2.getPrice() ? g1 : g2).get();
	} // gibt das billigste Spiel zurück

	/**
	 * Sucht nach dem Spiel mit dem hoechsten Preis.
	 * 
	 * @return Spiel mit dem hoechsten Preis
	 */
	public Game getMostExpensiveGame() {
		return gameDao.getGames().stream().reduce((g1, g2) -> g1.getPrice() > g2.getPrice() ? g1 : g2).get();
	}

	/**
	 * Gibt alle Spiele mit einem Preis höher dem mitgegebenem aus.
	 * 
	 * @param price Mindestpreis den ein Spiel haben muss
	 * @return Eine Liste mit Spielen, welche die Anfoderung erfüllen
	 */
	public List<Game> getGamesWithPriceAbove(float price) {
		return gameDao.getGames().stream().
				filter(g -> g.getPrice() > price).
				collect(Collectors.toList());
	}

	/**
	 * Gibt den Durchschnittspreis aller Spiele aus.
	 * 
	 * @return Durchschnittspreis
	 */
	public double getAverageGamePrice() {
		return gameDao.getGames().stream().mapToDouble((g) -> g.getPrice()).average().getAsDouble();
	}

	/**
	 * Legt die Spiele in Gruppen je Genre ab und errechnet deren
	 * Durchschnittspreis.
	 * 
	 * @return HashMap mit den Genre als Schluessel und Durchschnittspreisen
	 */
	public Map<String, Double> getAveragePriceByGenre() {
		return gameDao.getGames().stream()
				.collect(Collectors.groupingBy(g -> g.getGenre(), Collectors.averagingDouble(g -> g.getPrice())));
	}

	/**
	 * Gruppiert alle Spiele nach Genre.
	 * 
	 * @return HashMap mit Genre als Schluessel und eine Liste mit Spielen
	 */
	public Map<String, List<Game>> getGamesByGenre() {
		return gameDao.getGames().stream().collect(Collectors.groupingBy(g -> g.getGenre()));
	}
}
