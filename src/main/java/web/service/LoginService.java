package web.service;

/**
 * Business logic to handle login functions.
 * 
 * @author Ahsan.
 */
public class LoginService {

	/**
	 * Static method returns true for successful login, false otherwise.
	 * @param username
	 * @param password
	 * @return
	 */
	public static String login(String username, String password, String dob) {
		// Match a fixed user name and password.
		//
		if (username==null) {
			return "null username";
		}
		if (password==null) {
			return "null password";
		}
		if (dob==null) {
			return "null dob";
		}
		if (username.equals("")) {
			return "no username";
		}
		if (password.equals("")) {
			return "no password";
		}
		if (dob.equals("")) {
			return "no dob";
		}
		if (!username.equals("shreeyut"))
		{
			return "wrong username";
		}
		if (!password.equals("1234"))
		{
			return "wrong password";
		}
		if (!dob.equals("2000-02-01"))
		{
			return "wrong dob";
		}
		
		return "success";
		
	}
	
	
}
