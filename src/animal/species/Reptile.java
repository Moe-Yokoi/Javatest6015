package animal.species;

import animal.parent.Animal;

public class Reptile extends Animal{
	private String scales;
	private int bloodtype;
	
	
	public Reptile() {
		this.scales = "soft";
		this.bloodtype = 3;
	}
	public Reptile(String scales, int bloodtype, boolean backbone, String habitat, String respiration) {
		super(backbone, habitat, respiration);
		this.scales = scales;
		this.bloodtype = bloodtype;
	}
	

    
    public String getScales() {
    	return scales;

}
    public int getBloodtype() {
    	return bloodtype;

}
}