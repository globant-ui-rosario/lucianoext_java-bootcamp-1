package key2;

public class Building {
	private int id;
	private String classification;
	private Address address;
	private Structure structure;
	
	
	
	
	@Override
	public String toString() {
		return "Building [id=" + id + ", classification=" + classification + ", address=" + address + ", structure="
				+ structure + "]";
	}

	private Building (BuildingBuilder b){
		this.classification = b.classification;
		this.address = b.address;
		this.structure =b.structure;
			
	}

	public static class BuildingBuilder {
		String classification;
		private Address address;
		private Structure structure;
		private int id;
		
		public BuildingBuilder id (int id){
			this.id= id;
			return this;			
		}
		
		public BuildingBuilder classification(String classification){
			this.classification= classification;
			return this;			
		}
		
		public BuildingBuilder address(Address address){
			this.address = address;
			return this;
		}
		
		public BuildingBuilder structure (Structure structure){
			this.structure = structure;
			return this;
		}
		
		public Building build(){
			return new Building(this);
			
		}

		
		}


		
		
		
		
	
}
