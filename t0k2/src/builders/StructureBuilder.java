package builders;

import building.Structure;

public class StructureBuilder {
		 
		private int NFloors,NBathrooms,NBedrooms;
		
		public StructureBuilder  NFloors(int  NFloors){
			this. NFloors =  NFloors;
			return this;
		}
		
		public StructureBuilder NBathrooms(int NBathrooms){
			this.NBathrooms = NBathrooms;
			return this;
		}
		
		public StructureBuilder NBedrooms(int NBedrooms){
			this.NBedrooms = NBedrooms;
			return this;
		}
		
		public Structure build(){
			return new Structure(this);
		}

//getters
		
		public int getNFloors() {
			return NFloors;
		}

		public int getNBathrooms() {
			return NBathrooms;
		}

		public int getNBedrooms() {
			return NBedrooms;
		}
		
		
}
