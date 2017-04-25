package building;

import builders.StructureBuilder;

public class Structure {

	private int NFloors,NBathrooms,NBedrooms;
	
	@Override
	public String toString() {
		return "Structure [NFloors=" + NFloors + ", NBathrooms=" + NBathrooms + ", NBedrooms=" + NBedrooms + "]";
	}
	
	public Structure(){
		NFloors=NBathrooms=NBedrooms=0;
	}
	
	public Structure(StructureBuilder b){
		this.NFloors = b.getNFloors();
		this.NBathrooms = b.getNBathrooms();
		this.NBedrooms =b.getNBedrooms();
	}
	

}
