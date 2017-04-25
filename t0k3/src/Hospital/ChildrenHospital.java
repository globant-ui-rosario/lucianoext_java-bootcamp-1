package Hospital;

import builders.ChildrenHospitalBuilder;

public class ChildrenHospital extends Hospital{
	
	private int ageLimit;
	
	public ChildrenHospital (ChildrenHospitalBuilder b){
		this.name =b.getName();
		this.ageLimit=b.getAgeLimit();
		this.description=b.getDescription();
		
		
	}
	
/*	public static class ChildrenHospitalBuilder extends Builder{
		
		private String name;
		private String description;
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
		
		
	}*/
}
