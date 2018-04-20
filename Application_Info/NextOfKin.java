package Application_Info;
public class NextOfKin {

	@Override
	public String toString() {
		return "NextOfKin [getRelationship()=" + getRelationship() + ", getKinFirstName()=" + getKinFirstName()
				+ ", getKinLastName()=" + getKinLastName() + ", getKinContact()=" + getKinContact() + "]";
	}

	private String relationship;
	private String kinFirstName;
	private String kinLastName;
	private Contact kinContact;

	public String getRelationship() {
		return this.relationship;
	}

	/**
	 * 
	 * @param relationship
	 */
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	public String getKinFirstName() {
		return this.kinFirstName;
	}

	/**
	 * 
	 * @param kinFirstName
	 */
	public void setKinFirstName(String kinFirstName) {
		this.kinFirstName = kinFirstName;
	}

	public String getKinLastName() {
		return this.kinLastName;
	}

	/**
	 * 
	 * @param kinLastName
	 */
	public void setKinLastName(String kinLastName) {
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