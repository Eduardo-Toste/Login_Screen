package LoginScreen;
import java.util.HashMap;
import java.util.Map;


/**
 * A simple class for user authentication, simulating a user databse
 */
public class LoginScreen {
	
	private Map<String, String> userDatabase;
	
	/**
	 * Constructs a new LoginScreen instance and initializes the user database.
	 * For example purposes, it preloads the database with some sample users.
	 */
	
	public LoginScreen() {
		
		userDatabase = new HashMap<>();
		userDatabase.put("john", "password123");
		userDatabase.put("alica", "securepass");

	}
	
	/**
	 * Attempts to authenticate a user based on their username and password
	 * 
	 * @param username The username of the user attempting to log in
	 * @param password The password entered by the user.
	 * @return {@code true} if authentication is successful, {@code false} otherwise
	 */

	public boolean login(String username, String password) {
		
		if(userDatabase.containsKey(username)) {
			String storedPassword = userDatabase.get(username);
			if (storedPassword.equals(password)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Adds a new user to the user database. Please note that this method is not
	 * reccommended for use in a production environment as it lacks proper security
	 * measures
	 * 
	 * @param username the username of the new user
	 * @param password The password of the new user
	 */

	public void addUser(String username, String password) {
		userDatabase.put(username, password);
		
	}

}