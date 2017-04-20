package topic0;

public class BuildingDirector {

	private BuildingBuilder buildingBuilder=null;

	public BuildingDirector (BuildingBuilder buildingBuilder) {
		this.buildingBuilder = buildingBuilder;
	}

	public void constructBuilding() {
		buildingBuilder.buildAddress();
		buildingBuilder.buildStructure();
		
	}

	public Building getBuilding() {
		return buildingBuilder.getBuilding();
	}

}