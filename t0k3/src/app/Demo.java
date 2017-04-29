package app;

import Hospital.Hospital;
import factory.HospitalFactory;

public class Demo {

	public static void main(String[] args) {
		Hospital hospital =  new HospitalFactory().getHospital("Mental");
											  
	
	
	Hospital hospital2 = new HospitalFactory().getHospital("Children");
											  
	System.out.println(hospital+"\n"+hospital2);

	}

}


