import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class SQ5B_FilterClosure {
	
	public static void main(String[] args) {
		List<Integer> liste = IntStream.range(0, 100)
				.boxed()
				.collect(Collectors.toList());
		List<Integer>  filterValues = filterList(liste, 2);
		filterValues.forEach(x -> System.out.println(x));		
	}

    public static List<Integer> filterList(List<Integer> liste, int filter){
        // hier kommen die gefilterten Werte rein
		List<Integer> filterValues = new ArrayList<>();
		
		liste.forEach((i) -> {
			if (i % 2 == 0) {
				filterValues.add(i);
			}
		});
		return filterValues;
    }
}