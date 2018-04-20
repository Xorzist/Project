package Application_Info;
public class Contact {

	@Override
	public String toString() {
		return "Contact [getPhoneNumber1()=" + getPhoneNumber1() + ", getPhoneNumber2()=" + getPhoneNumber2()
				+ ", getParish()=" + getParish() + ", getCity()=" + getCity() + ", getStreet()=" + getStreet() + "]";
	}

	private String phoneNumber1;
	private String phoneNumber2;
	private String parish;
	private String city;
	private String street;

	public String getPhoneNumber1() {
		return this.phoneNumber1;
	}

	/**
	 * 
	 * @param phoneNumber1
	 */
	public void setPhoneNumber1(String phoneNumber1) {
		this.phoneNumber1 = phoneNumber1;
	}

	public String getPhoneNumber2() {
		return this.phoneNumber2;
	}

	/**
	 * 
	 * @param phoneNumber2
	 */
	public void setPhoneNumber2(String phoneNumber2) {
		this.phoneNumber2 = phoneNumber2;
	}

	public String getParish() {
		return this.parish;
	}

	/**
	 * 
	 * @param parish
	 */
	public void setParish(String parish) {
		this.parish = parish;
	}

	public String getCity() {
		return this.city;
	}

	/**
	 * 
	 * @param city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return this.street;
	}

	/**
	 * 
	 * @param street
	 */
	public void setStreet(String street) {
		this.street = street;
	}

}