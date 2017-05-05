package building;

import builders.BuildingBuilder;

public class Building {
	private String classification;
	private Address address;
	private Structure structure;
	
	@Override
	public String toString() {
		return "Building [classification=" + classification + ", address=" + address + ", structure=" + structure + "]";
	}

	public Building(){
		classification=null;
		address=null;
		structure=null;
				
	}
	
	public Building(BuildingBuilder b){
		this.address = b.getAddress();
		this.classification = b.getClassification();
		this.structure =b.getStructure();
	}
	

}
