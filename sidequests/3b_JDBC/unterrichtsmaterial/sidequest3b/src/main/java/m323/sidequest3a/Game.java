package m323.sidequest3a;

import java.util.Date;

/**
 * Model for Game saved in database
 * 
 * @author Patrick Meier
 *
 */
public class Game {
	private int id;
	private String title;
	private String genre;
	private float price;
	private Date releaseDate;

	public Game() {
	}

	public Game(int id, String title, String genre, float price, Date releaseDate) {
		this.id = id;
		this.title = title;
		this.genre = genre;
		this.price = price;
		this.releaseDate = releaseDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
}
