package app;

import Hospital.Hospital;
import factory.HospitalFactory;

public class Demo {
	Hospital hospital = new HospitalFactory().getBuilder("Mental").
											  warden("Eric Cartman").
											  name("Sunshine and Rainbows").
											  description("is like suicide squad but without Will Smith").
											  Build();
	
	Hospital hospital = new HospitalFactory().getBuilder("Children").
											  ageLimit(10).
											  name("Highway to Hell").
											  description("where little angels are made").
											  Build();
											 
											
}
	


