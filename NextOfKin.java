public class NextOfKin {

	private string relationship;
	private string kinFirstName;
	private string kinLastName;
	private Contact kinContact;

	public string getRelationship() {
		return this.relationship;
	}

	/**
	 * 
	 * @param relationship
	 */
	public void setRelationship(string relationship) {
		this.relationship = relationship;
	}

	public string getKinFirstName() {
		return this.kinFirstName;
	}

	/**
	 * 
	 * @param kinFirstName
	 */
	public void setKinFirstName(string kinFirstName) {
		this.kinFirstName = kinFirstName;
	}

	public string getKinLastName() {
		return this.kinLastName;
	}

	/**
	 * 
	 * @param kinLastName
	 */
	public void setKinLastName(string kinLastName) {
		this.kinLastName = kinLastName;
	}

	public Contact getKinContact() {
		return this.kinContact;
	}

	/**
	 * 
	 * @param kinContact
	 */
	public void setKinContact(Contact kinContact) {
		this.kinContact = kinContact;
	}

}