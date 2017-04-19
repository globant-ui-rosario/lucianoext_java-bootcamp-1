package topic0;
//I tried to run the demo as shown in the example
public class Demo {

	public static void main(String[] args) {

		BuildingBuilder buildingBuilder = new HomeBuilder();
		BuildingDirector buildingDirector = new BuildingDirector(buildingBuilder);
		buildingDirector.constructBuilding();
		Building building = buildingDirector.getBuilding();
		System.out.println("Building data: " + building);
		
 		buildingBuilder = new DuplexBuilder();
		buildingDirector = new BuildingDirector(buildingBuilder);
		buildingDirector.constructBuilding();
		building = buildingDirector.getBuilding();
		System.out.println("Building data: " + building);
	}

}