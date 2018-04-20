package Application_Types;
import java.util.Date;

import Application_Info.Contact;
import Application_Info.NextOfKin;
import Base.*;
import Enumerated_Classes.Intern_PrimaryCareInstitution;
import Enumerated_Classes.MaritalStatus;
import Enumerated_Classes.SecondaryCareInstitution;
import Enumerated_Classes.Sex;

public class MedicalIntern implements Application {

	

	@Override
	public String toString() {
		return "MedicalIntern [getSex()=" + getSex() + ", getContact()=" + getContact() + ", getAge()=" + getAge()
				+ ", getMaritalStatus()=" + getMaritalStatus() + ", getGradYear()=" + getGradYear()
				+ ", getNationality()=" + getNationality() + ", getDegree()=" + getDegree() + ", getKin()=" + getKin()
				+ ", getInstit_ofTraining()=" + getInstit_ofTraining() + ", getPeriod()=" + getPeriod()
				+ ", getRegistrationDate()=" + getRegistrationDate() + ", getPrime_Instit()=" + getPrime_Instit()
				+ ", getPrimeChoice()=" + getPrimeChoice() + ", getSecondChoice()=" + getSecondChoice() + ", isType()="
				+ isType() + "]";
	}

	private Sex sex;
	private Contact contact;
	private int age;
	private MaritalStatus maritalStatus;
	private Date gradYear;
	private String nationality;
	private String degree;
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

	public MaritalStatus getMaritalStatus() {
		return this.maritalStatus;
	}

	/**
	 * 
	 * @param maritalStatus
	 */
	public void setMaritalStatus(MaritalStatus maritalStatus) {
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

	public String getNationality() {
		return this.nationality;
	}

	/**
	 * 
	 * @param nationality
	 */
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getDegree() {
		return this.degree;
	}

	/**
	 * 
	 * @param degree
	 */
	public void setDegree(String degree) {
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

	private String instit_ofTraining;
	private Date period;
	private Date registrationDate;
	private Intern_PrimaryCareInstitution prime_Instit;
	private Intern_PrimaryCareInstitution primeChoice;
	private SecondaryCareInstitution secondChoice;

	public String getInstit_ofTraining() {
		return this.instit_ofTraining;
	}

	/**
	 * 
	 * @param Iistit_ofTraining
	 */
	public void setInstit_ofTraining(String Iistit_ofTraining) {
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

	public String isType() {
		return "Med";
		//throw new UnsupportedOperationException();
	}

}