package animal.species;

import animal.parent.Animal;

public class Fish extends Animal {
	private String fin;
	private int bloodtype;
	private String habitatFish;
	private String respFish;
	
	public Fish() {
		this.fin = "hard";
		this.bloodtype = 1;
		this.habitatFish = "underwater";
		this.respFish = "gills";
	}
	public Fish(String fin, int bloodtype, String respFish, String habitatFish, boolean backbone, String habitat, String respiration) {
		super(backbone, habitat, respiration);
		this.fin = fin;
		this.bloodtype = bloodtype;
		this.habitatFish = habitatFish;
		this.respFish = respFish;
	}
	

    
    public String getFin() {
    	return fin;

}
    public int getBloodtype() {
    	return bloodtype;

}
    public String getHabitatFish() {
    	return habitatFish;

}

    public String getRespFish() {
    	return respFish;

}
}
