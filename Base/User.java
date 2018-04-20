package Base;
public class User {

	@Override
	public String toString() {
		return "User [getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + ", getEmail()="
				+ getEmail() + ", getApplication()=" + getApplication() + "]";
	}

	private String firstName;
	private String lastName;
	private String email;
	private Application application;

	public String getFirstName() {
		return this.firstName;
	}

	/**
	 * 
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	/**
	 * 
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return this.email;
	}

	/**
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
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