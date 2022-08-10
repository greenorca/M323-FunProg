package wiss.m323;

import static org.junit.Assert.fail;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NotenServiceTest {

	INotenService service;

	@BeforeEach
	public void setup() {

		List<Note> noten = Stream.of(new Note("M117", 6), new Note("M122", 5.5), new Note("M162", 5),
				new Note("M164", 4.5), new Note("M187", 4), new Note("M231", 3.5), new Note("M319", 3),
				new Note("M431", 2.5), new Note("M106", 2), new Note("M114", 1.5), new Note("M123", 1),
				new Note("M254", 3.1), new Note("M293", 3), new Note("M306", 3.7), new Note("M346", 4)).toList();

		service = new NotenService(noten);
	}

	@Test
	public void whenHole5Besten_returns5Besten() {
		fail("Not implemented yet");
	}

	@Test
	public void givenNotenwert4_whenholeNotenSchlechterAls_returns9Noten() {
		fail("Not implemented yet");
	}

	@Test
	public void whenHoleDurchschnitt_returnsAverage() {
		fail("Not implemented yet");
	}
}