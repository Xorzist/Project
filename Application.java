public class Application {

	private Sex sex;
	private Contact contact;
	private int age;
	private MaritallStatus maritalStatus;
	private Date gradYear;
	private string nationality;
	private string degree;
	private NextOfKin kin;

	public Sex getSex() {
		return this.sex;
	}

	/**
	 * 
	 * @param sex
	 */
	public void setSex(Sex sex) {
		this.sex = sex;
	}

	public Contact getContact() {
		return this.contact;
	}

	/**
	 * 
	 * @param contact
	 */
	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public int getAge() {
		return this.age;
	}

	/**
	 * 
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	public MaritallStatus getMaritalStatus() {
		return this.maritalStatus;
	}

	/**
	 * 
	 * @param maritalStatus
	 */
	public void setMaritalStatus(MaritallStatus maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public Date getGradYear() {
		return this.gradYear;
	}

	/**
	 * 
	 * @param gradYear
	 */
	public void setGradYear(Date gradYear) {
		this.gradYear = gradYear;
	}

	public string getNationality() {
		return this.nationality;
	}

	/**
	 * 
	 * @param nationality
	 */
	public void setNationality(string nationality) {
		this.nationality = nationality;
	}

	public string getDegree() {
		return this.degree;
	}

	/**
	 * 
	 * @param degree
	 */
	public void setDegree(string degree) {
		this.degree = degree;
	}

	public NextOfKin getKin() {
		return this.kin;
	}

	/**
	 * 
	 * @param kin
	 */
	public void setKin(NextOfKin kin) {
		this.kin = kin;
	}

}