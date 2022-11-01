package m323;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

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
		List<Book> expectedBooks = Stream.of(
				new Book("Buch 1", "Author 1", 111, 2001),
				new Book("Buch 2", "Author 2", 222, 2002), 
				new Book("Buch 3", "Author 3", 333, 2003))
				.collect(Collectors.toList());
		LibraryService libService = new LibraryService(expectedBooks);

		// Act
		List<Book> actualBooks = libService.getBooks();

		// Assert
		assertNotNull(actualBooks);
		assertEquals(expectedBooks.size(), actualBooks.size());
	}
	
	@Test
	void mit3Buechern_getBookCount_gibt3Zurueck() {
		// Arrange
		List<Book> expectedBooks = Stream.of(
				new Book("Buch 1", "Author 1", 111, 2001),
				new Book("Buch 2", "Author 2", 222, 2002), 
				new Book("Buch 3", "Author 3", 333, 2003))
				.collect(Collectors.toList());
		LibraryService libService = new LibraryService(expectedBooks);

		// Act
		long actualBookCount = libService.getBookCount();

		// Assert
		assertEquals(expectedBooks.size(), actualBookCount);
	}
	
	// TODO: erfasse hier deine Tests

}
