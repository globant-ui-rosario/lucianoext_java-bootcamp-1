package builders;

import building.Address;

public class AddressBuilder {
		 
		private String street;
		private int addressNumber;
		
		public AddressBuilder street(String street){
			this.street = street;
			return this;
		}
		
		public AddressBuilder address(int addressNumber){
			this.addressNumber = addressNumber;
			return this;
		}

		
		public Address build(){
			return new Address(this);
		}

		
//getters
		public String getStreet() {
			return street;
		}

		public int getAddressNumber() {
			return addressNumber;
		}
		
		
}
