public class MedicalIntern extends Application {

	private string instit_ofTraining;
	private Date period;
	private Date registrationDate;
	private Intern_PrimaryCareInstitution prime_Instit;
	private Intern_PrimaryCareInstitution primeChoice;
	private SecondaryCareInstitution secondChoice;

	public string getInstit_ofTraining() {
		return this.instit_ofTraining;
	}

	/**
	 * 
	 * @param Iistit_ofTraining
	 */
	public void setInstit_ofTraining(string Iistit_ofTraining) {
		this.instit_ofTraining = Iistit_ofTraining;
	}

	public Date getPeriod() {
		return this.period;
	}

	/**
	 * 
	 * @param period
	 */
	public void setPeriod(Date period) {
		this.period = period;
	}

	public Date getRegistrationDate() {
		return this.registrationDate;
	}

	/**
	 * 
	 * @param registrationDate
	 */
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public Intern_PrimaryCareInstitution getPrime_Instit() {
		return this.prime_Instit;
	}

	/**
	 * 
	 * @param prime_Instit
	 */
	public void setPrime_Instit(Intern_PrimaryCareInstitution prime_Instit) {
		this.prime_Instit = prime_Instit;
	}

	public Intern_PrimaryCareInstitution getPrimeChoice() {
		return this.primeChoice;
	}

	/**
	 * 
	 * @param primeChoice
	 */
	public void setPrimeChoice(Intern_PrimaryCareInstitution primeChoice) {
		this.primeChoice = primeChoice;
	}

	public SecondaryCareInstitution getSecondChoice() {
		return this.secondChoice;
	}

	/**
	 * 
	 * @param secondChoice
	 */
	public void setSecondChoice(SecondaryCareInstitution secondChoice) {
		this.secondChoice = secondChoice;
	}

	public string isType() {
		// TODO - implement MedicalIntern.isType
		throw new UnsupportedOperationException();
	}

}