public class User {

	private string firstName;
	private string lastName;
	private string email;
	private Application application;

	public string getFirstName() {
		return this.firstName;
	}

	/**
	 * 
	 * @param firstName
	 */
	public void setFirstName(string firstName) {
		this.firstName = firstName;
	}

	public string getLastName() {
		return this.lastName;
	}

	/**
	 * 
	 * @param lastName
	 */
	public void setLastName(string lastName) {
		this.lastName = lastName;
	}

	public string getEmail() {
		return this.email;
	}

	/**
	 * 
	 * @param email
	 */
	public void setEmail(string email) {
		this.email = email;
	}

	public Application getApplication() {
		return this.application;
	}

	/**
	 * 
	 * @param application
	 */
	public void setApplication(Application application) {
		this.application = application;
	}

}