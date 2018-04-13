public class SeniorHouseOfficer extends Application {

	private string graduteSchool;
	private string gSchoolLocation;
	private SHO_PrimaryCareInstitution primaryInstiChoice;
	private SecondaryCareInstitution secondaryInstiChoice;

	public string getGraduteSchool() {
		return this.graduteSchool;
	}

	/**
	 * 
	 * @param graduteSchool
	 */
	public void setGraduteSchool(string graduteSchool) {
		this.graduteSchool = graduteSchool;
	}

	public string getGSchoolLocation() {
		return this.gSchoolLocation;
	}

	/**
	 * 
	 * @param gSchoolLocation
	 */
	public void setGSchoolLocation(string gSchoolLocation) {
		this.gSchoolLocation = gSchoolLocation;
	}

	public SHO_PrimaryCareInstitution getPrimaryInstiChoice() {
		return this.primaryInstiChoice;
	}

	/**
	 * 
	 * @param primaryInstiChoice
	 */
	public void setPrimaryInstiChoice(SHO_PrimaryCareInstitution primaryInstiChoice) {
		this.primaryInstiChoice = primaryInstiChoice;
	}

	public SecondaryCareInstitution getSecondaryInstiChoice() {
		return this.secondaryInstiChoice;
	}

	/**
	 * 
	 * @param secondaryInstiChoice
	 */
	public void setSecondaryInstiChoice(SecondaryCareInstitution secondaryInstiChoice) {
		this.secondaryInstiChoice = secondaryInstiChoice;
	}

	public string isType() {
		// TODO - implement SeniorHouseOfficer.isType
		throw new UnsupportedOperationException();
	}

}