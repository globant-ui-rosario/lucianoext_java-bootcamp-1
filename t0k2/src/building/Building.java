package building;

public class Building {
	private String classification;
	private Address address;
	private Structure structure;
	
	@Override
	public String toString() {
		return "Building [classification=" + classification + ", address=" + address + ", structure=" + structure + "]";
	}

	private Building(Builder b){
		this.address = b.address;
		this.classification = b.classification;
		this.structure =b.structure;
	}
	
	public static class Builder{
		 
		private String classification;
		private Address address;
		private Structure structure;
		
		public Builder classification(String classification){
			this.classification = classification;
			return this;
		}
		
		public Builder address(Address address){
			this.address = address;
			return this;
		}
		
		public Builder structure(Structure structure){
			this.structure = structure;
			return this;
		}
		
		public Building build(){
			return new Building(this);
		}
	}
}
