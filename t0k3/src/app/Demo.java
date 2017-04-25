package app;

import Hospital.Hospital;
import factory.HospitalFactory;
import builders.ChildrenHospitalBuilder;
import builders.MentalAsylumBuilder;

public class Demo {

	public static void main(String[] args) {
		Hospital hospital = ((MentalAsylumBuilder) new HospitalFactory().getBuilder("Mental")).
											  warden("Eric Cartman").
											  name("Sunshine and Rainbows").
											  description("is like suicide squad but without Will Smith").
											  Build();
	
	
	Hospital hospital2 = ((ChildrenHospitalBuilder) new HospitalFactory().getBuilder("Children")).
											  ageLimit(10).
											  name("Highway to Hell").
											  description("where little angels are born").
											  Build();
	System.out.println(hospital+"\n"+hospital2);

	}

}


