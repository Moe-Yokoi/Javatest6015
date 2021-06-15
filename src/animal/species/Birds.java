package animal.species;

import animal.parent.Animal;

public class Birds extends Animal {
	
	private String feathers;
	private int bloodtype;
	
	public Birds() {
		this.feathers = "thin";
		this.bloodtype = 22;
	}
	
	
	
	public Birds(String feathers, int bloodtype, boolean backbone, String habitat, String respiration) {
		super(backbone, habitat, respiration);
		this.feathers = feathers;
		this.bloodtype = bloodtype;
	}
	

    
    public String getFeathers() {
    	return feathers;

}
    public int getBloodtype() {
    	return bloodtype;

}

}
