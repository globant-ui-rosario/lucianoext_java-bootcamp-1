package topic0;

public class HomeBuilder implements BuildingBuilder {

private Building building;

		public HomeBuilder() {
			building = new Building();
		}

		@Override
		public void buildAddress() {
			building.setAddressNumber(123);
			building.setStreet("Fake Street");
		}
		@Override
		
		public void buildStructure(){
			building.setNFloors(2);
			building.setNRooms(5);
		}

		@Override
		public Building getBuilding() {
			return building;
		}
	}
