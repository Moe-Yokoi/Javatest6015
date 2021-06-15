package animal.individual;

import animal.species.Reptile;

public class Crocodile {

	public static void main(String[] args) {
		
		Reptile reptile = new Reptile();
		
		System.out.println("Scales: " + reptile.getScales());
		System.out.println("Vertebrates?: " + reptile.isBackbone());
		System.out.println("The number of bloodtype: " + reptile.getBloodtype());
		System.out.println("Habitat: " + reptile.getHabitat());
		System.out.println("Respiration: " + reptile.getRespiration());
		
		System.out.println(reptile);
	}

}
