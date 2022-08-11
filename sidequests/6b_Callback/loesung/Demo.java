import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo {

	public static void main(String[] args) {
		int a = 1, b = 2;
		System.out.println("Berechne...");
		Task task = new Task();
				
		ExecutorService exServer = Executors.newSingleThreadExecutor();
		exServer.execute(()->{
			task.slowSum(a, b, 
					() -> System.out.println("Callback, Ergebnis: "+task.result.get()) //Callback-Objekt
				);
		});
		
		try {
			int i = 0; 
			while (i < 6) {
				System.out.println("Busy with other stuff");
				Thread.sleep(1000);
				i += 1;
			}			
		} catch (Exception ex) {			
		}		
	}

}
