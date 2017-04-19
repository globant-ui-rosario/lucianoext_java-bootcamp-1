package topic0;

public class DuplexBuilder implements BuildingBuilder {

private Building building;

		public DuplexBuilder() {
			building = new Building();
		}

		@Override
		public void buildAddress() {
			building.setAddressNumber(42);;
			building.setStreet("St Monica");
		}
		@Override
		
		public void buildStructure(){
			building.setNFloors(2);
			building.setNRooms(3);
		}

		@Override
		public Building getBuilding() {
			return building;
		}
	}
