package factory;

import builders.Builder;
import builders.ChildrenHospitalBuilder;
import builders.MentalAsylumBuilder;

public class HospitalFactory{
	public Builder getBuilder(String type){
		if ("Mental".equalsIgnoreCase(type)){
			return new MentalAsylumBuilder();
		}else {
			return new ChildrenHospitalBuilder();
		}
		
	}
}