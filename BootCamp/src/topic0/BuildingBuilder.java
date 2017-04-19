package topic0;
//this is the abstract builder
public interface BuildingBuilder {

	public void buildAddress();//address refers to street and addressNumber

	public void buildStructure();//Structure refers to the number of rooms and floors from the building
	
	public Building getBuilding();

}