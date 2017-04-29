package building;

public class Demo {

	public static void main(String[] args) {
		Address address=new Address.Builder().
				   address(123).
				   street("fake street").
				   build();
		
		Structure structure=new Structure.Builder().
								  NBathrooms(2).
								  NBedrooms(3).
								  NFloors(2).
								  build();

		Building building=new Building.
					  Builder().
					  address(address).
					  structure(structure).
					  classification("duplex").
					  build();

		System.out.println(building);



	}

}
