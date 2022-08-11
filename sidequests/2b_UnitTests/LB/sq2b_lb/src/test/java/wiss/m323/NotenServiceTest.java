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

        List<Note> noten = Stream.of(new Note("M117", 6),   new Note("M122", 2.5), new Note("M162", 3),
			                         new Note("M164", 5.5), new Note("M187", 4),   new Note("M231", 4.5)).toList();

		service = new NotenService(noten);
	}

	@Test
	public void whenHole3Besten_returns3Besten() {
		fail("Not implemented yet");
	}

	@Test
	public void givenNotenwert4_whenHoleNotenSchlechterAls_returns2Noten() {
		fail("Not implemented yet");
	}

	@Test
	public void whenHoleDurchschnitt_returnsAverage() {
		fail("Not implemented yet");
	}
}