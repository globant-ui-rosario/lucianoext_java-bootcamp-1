package building;


public class Address {
	private String street;
	private int addressNumber;
	
	@Override
	public String toString() {
		return "Address [street=" + street + ", addressNumber=" + addressNumber + "]";
	}

	private Address(Builder b){
		this.addressNumber = b.addressNumber;
		this.street = b.street;
		
	}
	
	public static class Builder{
		 
		private String street;
		private int addressNumber;
		
		public Builder street(String street){
			this.street = street;
			return this;
		}
		
		public Builder address(int addressNumber){
			this.addressNumber = addressNumber;
			return this;
		}

		
		public Address build(){
			return new Address(this);
		}
	}
}
