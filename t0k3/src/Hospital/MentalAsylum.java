package Hospital;



public class MentalAsylum extends Hospital {

	private String warden;
	
	public MentalAsylum(){
		warden="Quincy Sharp";
		name="Arkham Asylum";
	}

	@Override
	public String toString() {
		return "MentalAsylum [warden=" + warden + ", name=" + name + "]";
	}
	
	

}
	

