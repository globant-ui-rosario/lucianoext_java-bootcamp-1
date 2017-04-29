package factory;

import Hospital.ChildrenHospital;
import Hospital.Hospital;
import Hospital.MentalAsylum;


public class HospitalFactory{
	public Hospital getHospital(String type){
		if ("Mental".equalsIgnoreCase(type)){
			return new MentalAsylum();
		}else {
			return new ChildrenHospital();
		}
		
	}
}