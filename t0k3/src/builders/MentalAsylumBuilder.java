package builders;

import Hospital.MentalAsylum;

public class MentalAsylumBuilder extends Builder{
	

	private String warden;
	
	public MentalAsylumBuilder warden (String warden){
		this.warden = warden;
		return this;
		
	}
	
	public MentalAsylumBuilder name(String name){
		this.name = name;
		return this;
	}
	
	public MentalAsylumBuilder description(String description){
		this.description = description;
		return this;
	}
	
	public MentalAsylum Build(){
		return new MentalAsylum (this);
	}
//Getter
	public String getWarden() {
		return warden;
	}
	
	
}