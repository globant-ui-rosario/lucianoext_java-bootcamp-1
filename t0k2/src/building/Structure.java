package building;


public class Structure {

	private int NFloors,NBathrooms,NBedrooms;
	
	@Override
	public String toString() {
		return "Structure [NFloors=" + NFloors + ", NBathrooms=" + NBathrooms + ", NBedrooms=" + NBedrooms + "]";
	}

	private Structure(Builder b){
		this.NFloors = b.NFloors;
		this.NBathrooms = b.NBathrooms;
		this.NBedrooms =b.NBedrooms;
	}
	
	public static class Builder{
		 
		private int NFloors,NBathrooms,NBedrooms;
		
		public Builder  NFloors(int  NFloors){
			this. NFloors =  NFloors;
			return this;
		}
		
		public Builder NBathrooms(int NBathrooms){
			this.NBathrooms = NBathrooms;
			return this;
		}
		
		public Builder NBedrooms(int NBedrooms){
			this.NBedrooms = NBedrooms;
			return this;
		}
		
		public Structure build(){
			return new Structure(this);
		}
	}
}
