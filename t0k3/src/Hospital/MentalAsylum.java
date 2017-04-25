package Hospital;

import builders.MentalAsylumBuilder;

public class MentalAsylum extends Hospital {

	private String warden;
	
	public MentalAsylum (MentalAsylumBuilder b){
		this.name =b.getName();
		this.warden=b.getWarden();
		this.description=b.getDescription();
		
		
	}
	
/*	public static class MentalAsylumBuilder extends Builder{
		
		private String name;
		private String description;
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
		
		
	}*/
}
	

