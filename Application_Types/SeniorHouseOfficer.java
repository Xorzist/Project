package Application_Types;
import java.util.Date;

import Application_Info.Contact;
import Application_Info.NextOfKin;
import Base.*;
import Enumerated_Classes.MaritalStatus;
import Enumerated_Classes.SHO_PrimaryCareInstitution;
import Enumerated_Classes.SecondaryCareInstitution;
import Enumerated_Classes.Sex;

public class SeniorHouseOfficer implements Application {

	
	

	@Override
	public String toString() {
		return "SeniorHouseOfficer [getSex()=" + getSex() + ", getContact()=" + getContact() + ", getAge()=" + getAge()
				+ ", getMaritalStatus()=" + getMaritalStatus() + ", getGradYear()=" + getGradYear()
				+ ", getNationality()=" + getNationality() + ", getDegree()=" + getDegree() + ", getKin()=" + getKin()
				+ ", getGraduteSchool()=" + getGraduteSchool() + ", getGSchoolLocation()=" + getGSchoolLocation()
				+ ", getPrimaryInstiChoice()=" + getPrimaryInstiChoice() + ", getSecondaryInstiChoice()="
				+ getSecondaryInstiChoice() + ", isType()=" + isType() + "]";
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
	

	private String graduteSchool;
	private String gSchoolLocation;
	private SHO_PrimaryCareInstitution primaryInstiChoice;
	private SecondaryCareInstitution secondaryInstiChoice;

	public String getGraduteSchool() {
		return this.graduteSchool;
	}

	/**
	 * 
	 * @param graduteSchool
	 */
	public void setGraduteSchool(String graduteSchool) {
		this.graduteSchool = graduteSchool;
	}

	public String getGSchoolLocation() {
		return this.gSchoolLocation;
	}

	/**
	 * 
	 * @param gSchoolLocation
	 */
	public void setGSchoolLocation(String gSchoolLocation) {
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

	public String isType() {
		return "Sen";
		// TODO - implement SeniorHouseOfficer.isType
		//throw new UnsupportedOperationException();
	}

}