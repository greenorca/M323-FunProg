package m323;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import m323.model.Book;

class LibraryServiceTest {

	@Test
	void ohneBuecher_getBooks_gibtNull() {
		// Arrange
		LibraryService libService = new LibraryService(null);

		// Act
		List<Book> actualBooks = libService.getBooks();

		// Assert
		assertNull(actualBooks);
	}

	@Test
	void mitBuechern_getBooks_gibtBuecher() {
		// Arrange
		List<Book> expectedBooks = Stream.of(new Book("Buch 1", "Author 1", 111, 2001),
				new Book("Buch 2", "Author 2", 222, 2002), new Book("Buch 3", "Author 3", 333, 2003))
				.collect(Collectors.toList());
		LibraryService libService = new LibraryService(expectedBooks);

		// Act
		List<Book> actualBooks = libService.getBooks();

		// Assert
		assertNotNull(actualBooks);
		assertEquals(expectedBooks.size(), actualBooks.size());
	}

	@Test
	void mit3Buechern_getBookCount_gibt3() {
		// Arrange
		List<Book> expectedBooks = Stream.of(new Book("Buch 1", "Author 1", 111, 2001),
				new Book("Buch 2", "Author 2", 222, 2002), new Book("Buch 3", "Author 3", 333, 2003))
				.collect(Collectors.toList());
		LibraryService libService = new LibraryService(expectedBooks);

		// Act
		long actualBookCount = libService.getBookCount();

		// Assert
		assertEquals(expectedBooks.size(), actualBookCount);
	}

	@Test
	void mitJahr2002_getBooksAfterYear_gibt2() {
		// Arrange
		List<Book> expectedBooks = Stream.of(new Book("Buch 1", "Author 1", 111, 2001),
				new Book("Buch 2", "Author 2", 222, 2002), new Book("Buch 3", "Author 3", 333, 2003))
				.collect(Collectors.toList());
		LibraryService libService = new LibraryService(expectedBooks);

		// Act
		long actualBookCount = libService.getBooksAfterYear(2002);

		// Assert
		assertEquals(2, actualBookCount);
	}

	@Test
	void mit666_getOverallBookSells_gibt666() {
		// Arrange
		List<Book> expectedBooks = Stream.of(new Book("Buch 1", "Author 1", 111, 2001),
				new Book("Buch 2", "Author 2", 222, 2002), new Book("Buch 3", "Author 3", 333, 2003))
				.collect(Collectors.toList());
		LibraryService libService = new LibraryService(expectedBooks);

		// Act
		int actualSellCount = libService.getOverallBookSells();

		// Assert
		assertEquals(666, actualSellCount);
	}

	@Test
	void mit666Insgesamt_getOverallAverageBookSells_gibt222() {
		// Arrange
		List<Book> expectedBooks = Stream.of(new Book("Buch 1", "Author 1", 111, 2001),
				new Book("Buch 2", "Author 2", 222, 2002), new Book("Buch 3", "Author 3", 333, 2003))
				.collect(Collectors.toList());
		LibraryService libService = new LibraryService(expectedBooks);

		// Act
		double actualSellCount = libService.getOverallAverageBookSells();

		// Assert
		assertEquals(222, actualSellCount);
	}

	@Test
	void mit111_getLeastSellingBook_gibtBuch1() {
		// Arrange
		List<Book> expectedBooks = Stream.of(new Book("Buch 1", "Author 1", 111, 2001),
				new Book("Buch 2", "Author 2", 222, 2002), new Book("Buch 3", "Author 3", 333, 2003))
				.collect(Collectors.toList());
		LibraryService libService = new LibraryService(expectedBooks);

		// Act
		Book actualLeastSellingBook = libService.getLeastSellingBook();

		// Assert
		assertNotNull(actualLeastSellingBook);
		assertEquals("Buch 1", actualLeastSellingBook.getTitle());
	}

	@Test
	void mit333_getMostSellingBook_gibtBuch3() {
		// Arrange
		List<Book> expectedBooks = Stream.of(new Book("Buch 1", "Author 1", 111, 2001),
				new Book("Buch 2", "Author 2", 222, 2002), new Book("Buch 3", "Author 3", 333, 2003))
				.collect(Collectors.toList());
		LibraryService libService = new LibraryService(expectedBooks);

		// Act
		Book actualMostSellingBook = libService.getMostSellingBook();

		// Assert
		assertNotNull(actualMostSellingBook);
		assertEquals("Buch 3", actualMostSellingBook.getTitle());
	}

	@Test
	void mitAuthor2_getBookSellsForAuthor_gibt555() {
		// Arrange
		List<Book> expectedBooks = Stream.of(new Book("Buch 1", "Author 1", 111, 2001),
				new Book("Buch 2", "Author 2", 222, 2002), new Book("Buch 3", "Author 2", 333, 2003))
				.collect(Collectors.toList());
		LibraryService libService = new LibraryService(expectedBooks);

		// Act
		int actualSellCount = libService.getBookSellsForAuthor("Author 2");

		// Assert
		assertEquals(555, actualSellCount);
	}

	@Test
	void mitJahr2001Und2003_getSellsBetweenYears_gibtBuch2() {
		// Arrange
		List<Book> expectedBooks = Stream.of(new Book("Buch 1", "Author 1", 111, 2001),
				new Book("Buch 2", "Author 2", 222, 2002), new Book("Buch 3", "Author 3", 333, 2003))
				.collect(Collectors.toList());
		LibraryService libService = new LibraryService(expectedBooks);

		// Act
		List<Book> actualBooks = libService.getSellsBetweenYears(2001, 2003);

		// Assert
		assertNotNull(actualBooks);
		assertEquals(1, actualBooks.size());
		assertEquals("Buch 2", actualBooks.get(0).getTitle());
	}

	@Test
	void mitJahr2001_getOldestBook_gibtJahr2001() {
		// Arrange
		List<Book> expectedBooks = Stream.of(new Book("Buch 1", "Author 1", 111, 2001),
				new Book("Buch 2", "Author 2", 222, 2002), new Book("Buch 3", "Author 3", 333, 2003))
				.collect(Collectors.toList());
		LibraryService libService = new LibraryService(expectedBooks);

		// Act
		Book actualBook = libService.getOldestBook();

		// Assert
		assertNotNull(actualBook);
		assertEquals(2001, actualBook.getReleaseYear());
	}

	@Test
	void mitJahr2003_getLatestReleaseYear_gibt2003() {
		// Arrange
		List<Book> expectedBooks = Stream.of(new Book("Buch 1", "Author 1", 111, 2001),
				new Book("Buch 2", "Author 2", 222, 2002), new Book("Buch 3", "Author 3", 333, 2003))
				.collect(Collectors.toList());
		LibraryService libService = new LibraryService(expectedBooks);

		// Act
		int actualLatestYear = libService.getLatestReleaseYear();

		// Assert
		assertEquals(2003, actualLatestYear);
	}
}
