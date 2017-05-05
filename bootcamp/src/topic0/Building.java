package topic0;

public class Building {

	private int NRooms;
	private int addressNumber;
	private String street;
	private int NFloors;
	
	
	public int getNRooms() {
		return NRooms;
	}
	public void setNRooms(int nRooms) {
		NRooms = nRooms;
	}
	public int getAddressNumber() {
		return addressNumber;
	}
	public void setAddressNumber(int addressNumber) {
		this.addressNumber = addressNumber;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getNFloors() {
		return NFloors;
	}
	public void setNFloors(int nFloors) {
		NFloors = nFloors;
	}
	
	public String toString() {
		return "Number of rooms:" + NRooms + ", addressNumber:" + addressNumber + ", street: " + street +"Number of Floors: " + NFloors;
	}

	
	
}