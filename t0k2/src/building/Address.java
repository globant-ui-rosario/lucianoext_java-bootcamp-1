package building;

import builders.AddressBuilder;

public class Address {
	private String street;
	private int addressNumber;
	
	@Override
	public String toString() {
		return "Address [street=" + street + ", addressNumber=" + addressNumber + "]";
	}
public Address(){
	street=null;
	addressNumber=0;
}
	

	public Address(AddressBuilder b){
		this.addressNumber = b.getAddressNumber();
		this.street = b.getStreet();
		
	}

}
