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
		List<Note> result = service.hole3Besten();

		assertNotNull(result); // 1 pt falls min. eine der beiden vorhanden
		assertEquals(3, result.size()); // 1 pt falls min. eine der beiden vorhanden

		// 2 pt falls alle vorhanden
		assertEquals(6, result.get(0).getWert());
		assertEquals(5.5, result.get(1).getWert());
		assertEquals(4.5, result.get(2).getWert());
	}

	@Test
	public void givenNotenwert4_whenholeNotenSchlechterAls_returns2Noten() {
		List<Note> result = service.holeNotenSchlechterAls(4);

		assertNotNull(result); // 1 pt
		assertEquals(2, result.size()); // 1 pt
	}

	@Test
	public void whenHoleDurchschnitt_returnsAverage() {
		double expectedValue = 25.5 / 6; // oder 4.25 oder direkt im Assert = 1 pt
		double actualValue = service.holeDurchschnitt();

		assertEquals(expectedValue, actualValue); // 1 pt
	}
}