package Hospital;

import builders.MentalAsylumBuilder;

public class MentalAsylum extends Hospital {

	private String warden;
	
	public MentalAsylum (MentalAsylumBuilder b){
		this.name =b.getName();
		this.warden=b.getWarden();
		this.description=b.getDescription();
						
	}

	@Override
	public String toString() {
		return "MentalAsylum [warden=" + warden + ", name=" + name + ", description=" + description + "]";
	}
	
	

}
	

