package m323.sidequest3a;

/**
 * Ausführender Programmcode
 *  @author Patrick Meier
 */
public class App 
{
	private static DBHelper dbhelper = new DBHelper();
	
    public static void main( String[] args )
    {
    	System.out.println("App: Start");
    	
        // TODO: hier kommt Applikationslogik hin
    	dbhelper.connectionTest();
    	
    	System.out.println("App: Ende");
    }
}
