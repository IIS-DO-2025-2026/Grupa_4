package singleton;

public class DatabaseConnection {

	private static DatabaseConnection instance = new DatabaseConnection();
	
	/*public*/ private DatabaseConnection() {

	}

	//logika povezivanja na neku BP
	
	public static DatabaseConnection getInstance() {
		return instance;
	}	
	
}
