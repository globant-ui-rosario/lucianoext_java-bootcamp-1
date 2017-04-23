package key2;

public class Structure {
	
	private int nFloors, nBathrooms, nBedrooms;
	
	
	
	@Override
	public String toString() {
		return "Structure [nFloors=" + nFloors + ", nBathrooms=" + nBathrooms + ", nBedrooms=" + nBedrooms + "]";
	}
	
	
	public Structure(StructureBuilder b){
		this.nBathrooms = b.nBathrooms;
		this.nBedrooms = b.nBedrooms;
		this.nFloors = b.nFloors;		
			
				
		
	}
	public static class StructureBuilder{
		
		private int nFloors, nBathrooms, nBedrooms;
		
		public StructureBuilder nFloors(int nFloors){
			this.nFloors = nFloors;
			return this;
			
		}
		
		public StructureBuilder nBedrooms(int nBedrooms){
			this.nBedrooms = nBedrooms;
			return this;
		}
		
		public StructureBuilder nBathrooms (int nBathrooms){
			this.nBathrooms = nBathrooms;
			return this;
		}
		
		public Structure build(){
			return new Structure(this);
		}

		
		}
		
		
	
}
