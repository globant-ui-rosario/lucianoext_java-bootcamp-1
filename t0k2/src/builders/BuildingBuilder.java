package builders;

import building.Address;
import building.Building;
import building.Structure;

public class BuildingBuilder{
	 
	private String classification;
	private Address address;
	private Structure structure;
	
	public BuildingBuilder classification(String classification){
		this.classification = classification;
		return this;
	}
	
	public BuildingBuilder address(Address address){
		this.address = address;
		return this;
	}
	
	public BuildingBuilder structure(Structure structure){
		this.structure = structure;
		return this;
	}
	
	public Building build(){
		return new Building(this);
	}
//Getters	
	
	public String getClassification() {
		return classification;
	}

	public Address getAddress() {
		return address;
	}

	public Structure getStructure() {
		return structure;
	}	
	
}	