package m323.sidequest3a;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Executing program
 * 
 * @author Patrick Meier
 */
public class App {

	static GameService gameService = new GameService();

	public static void main(String[] args) {
		System.out.println("App: Start");

		System.out.println("\nDas billigste Spiel ist: " + gameService.getCheapestGame().getTitle());
		System.out.println("\nDas teuerste Spiel ist: " + gameService.getMostExpensiveGame().getTitle());
		System.out.println("\nDer Durchschnittspreis aller Spiele ist: " + gameService.getAverageGamePrice());

		System.out.println("\nDie Durchschnittspreise je Genre sind:");
		Map<String, Double> averageGenrePrices = gameService.getAveragePriceByGenre();
		for (Entry<String, Double> entry : averageGenrePrices.entrySet()) {
			System.out.println(entry.getKey() + "\t\t" + entry.getValue() + " CHF");
		}

		System.out.println("\nDie Anzahl Spiele je Genre sind:");
		Map<String, List<Game>> gamesByGenre = gameService.getGamesByGenre();
		for (Entry<String, List<Game>> entry : gamesByGenre.entrySet()) {
			System.out.println(entry.getKey() + "\t\t" + entry.getValue().size());
		}

		System.out.println("App: End");
	}
}
