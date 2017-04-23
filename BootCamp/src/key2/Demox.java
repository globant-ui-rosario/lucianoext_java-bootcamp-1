package key2;

public class Demox {

	public static void main(String[] args) {		
		
		
		Address address = new Address.AddressBuilder().
									 AddressNumber(123).
									 Street("fake street").
									 build();
		
		
		Structure structure = new Structure.StructureBuilder().
											nBathrooms(1).
											nBedrooms(3).
											nFloors(2).
											build();
		
		Building building = new Building.
								BuildingBuilder().
								id(5).
								address(address).
								structure(structure).
								classification("house").
								build();
		
		System.out.println(building.toString());
		
	}

}
