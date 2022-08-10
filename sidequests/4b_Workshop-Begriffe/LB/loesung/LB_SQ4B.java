import java.util.Optional;
import java.util.function.Function;

public class LB_SQ4B_Function {
	
	public static void main(String[] args) {
		
        //1.
		Function<Integer, Integer> myFun = (x) -> 2*x;
		//2.
		System.out.println(myFun.apply(2));
		//3.
		Optional<Integer> myLuckyOption = Optional.of(42);
		System.out.println(myLuckyOption.get());
		
	}
}