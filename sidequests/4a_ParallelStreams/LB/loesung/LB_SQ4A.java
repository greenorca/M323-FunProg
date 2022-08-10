import java.util.Calendar;
import java.util.List;
import java.util.stream.IntStream;

public class LB_SQ4A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> zahlen = IntStream.range(1, 5000000).boxed().
				toList();

		Calendar cal0 = Calendar.getInstance();
		
		long s0 = zahlen.stream()
				.filter( x -> x%2 == 1)
				.reduce(0, Integer::sum);
		long diff = Calendar.getInstance().getTimeInMillis() - cal0.getTimeInMillis();
		System.out.println("Ergebnis: "+s0+ ", Zeit: "+diff+" ms");
	
		cal0 = Calendar.getInstance();
		long s1 = zahlen.stream().parallel()
				.filter(x -> x%2==1 )
				.reduce(0, Integer::sum);
		long diff1 = Calendar.getInstance().getTimeInMillis() - cal0.getTimeInMillis();
		System.out.println("Ergebnis: "+s1+ ", Zeit: "+diff1+" ms");
		
	}
}