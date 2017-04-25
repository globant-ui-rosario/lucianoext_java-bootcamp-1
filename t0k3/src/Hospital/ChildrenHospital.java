package Hospital;

import builders.ChildrenHospitalBuilder;

public class ChildrenHospital extends Hospital{
	
	private int ageLimit;
	
	public ChildrenHospital (ChildrenHospitalBuilder b){
		this.name =b.getName();
		this.ageLimit=b.getAgeLimit();
		this.description=b.getDescription();
		
		
	}

	@Override
	public String toString() {
		return "ChildrenHospital [ageLimit=" + ageLimit + ", name=" + name + ", description=" + description + "]";
	}
	

}
