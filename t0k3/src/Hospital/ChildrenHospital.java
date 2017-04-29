package Hospital;


public class ChildrenHospital extends Hospital{
	
	private int ageLimit;
	
	public ChildrenHospital(){
		ageLimit=12;
		name="hells pass hospital";
		
	}

	@Override
	public String toString() {
		return "ChildrenHospital [ageLimit=" + ageLimit + ", name=" + name +  "]";
	}
	

}
