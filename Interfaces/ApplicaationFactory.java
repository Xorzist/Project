package Interfaces;

import Application_Types.MedicalIntern;
import Application_Types.SeniorHouseOfficer;
import Base.Application;

public class ApplicaationFactory {

	public static Application CreateApplication(String type){
		if (type.equals("Med"))
			return new MedicalIntern();
		else if (type.equals("Sen"))
			return new SeniorHouseOfficer();
		return null;
	}
	
	
	
}