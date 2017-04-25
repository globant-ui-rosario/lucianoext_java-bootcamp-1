package builders;

import Hospital.ChildrenHospital;

public class ChildrenHospitalBuilder extends Builder{

	private int ageLimit;
	
	public ChildrenHospitalBuilder ageLimit (int ageLimit){
		this.ageLimit = ageLimit;
		return this;
		
	}
	
	public ChildrenHospitalBuilder name(String name){
		this.name = name;
		return this;
	}
	
	public ChildrenHospitalBuilder description(String description){
		this.description = description;
		return this;
	}
	
	public ChildrenHospital Build(){
		return new ChildrenHospital(this);
	}

	//Getters
	
	public int getAgeLimit() {
		return ageLimit;
	}
	
	
	
	
	
}
