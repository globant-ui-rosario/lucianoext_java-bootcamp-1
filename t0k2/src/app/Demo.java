package app;

import builders.AddressBuilder;
import builders.BuildingBuilder;
import builders.StructureBuilder;
import building.Address;
import building.Building;
import building.Structure;

public class Demo {

	public static void main(String[] args) {
		Address address=new Address();
		address=new AddressBuilder().address(123).street("fake street").build();

		
		Structure structure=new Structure();
		structure=new StructureBuilder().NBathrooms(2).
										 NBedrooms(3).
										 NFloors(2).
										 build();

		Building building=new Building();			  
		building=new BuildingBuilder().
					  address(address).
					  structure(structure).
					  classification("Penthouse").
					  build();

		System.out.println(building);



	}

}
