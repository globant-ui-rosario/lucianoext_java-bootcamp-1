package key2;

public class Address {
	private int addressNumber;
	private String street;
	
		
	@Override
	public String toString() {
		return "Address [addressNumber=" + addressNumber + ", street=" + street + "]";
	}

	public Address(AddressBuilder b){
		this.addressNumber = b.addressNumber;
		this.street = b.street;
		
	}
	
	public static class AddressBuilder {
		private int addressNumber;
		private String street;
		
		public AddressBuilder AddressNumber(int addressNumber){
			this.addressNumber = addressNumber;	
			return this;
		}
		
		public AddressBuilder Street (String street){
			this.street = street;
			return this;		
		}
		public Address build(){
			return new Address(this);
		}
		
	}
	
			
}
