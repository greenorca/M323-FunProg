import java.util.Optional;

/**
 * simulates a long running task we don't want to wait for
 * @author sven
 *
 */
public class Task {
	
	Optional<Integer> result = Optional.empty();
	
	public void slowSum(int a , int b, Callback callMe) {
		try {
			Thread.sleep(1000);
			result=Optional.of(a+b);
			System.out.println("DEBUG::internes Ergebnis: "+(a+b));
			
			if (callMe != null) {
				callMe.call();
			}
		} catch (Exception e) {
			System.out.println("Maschine kaputt");
		}
	}

}
