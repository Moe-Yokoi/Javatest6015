package animal.individual;

import animal.species.Fish;

public class Eel {

	public static void main(String[] args) {
        
		Fish fish = new Fish();
		
		System.out.println("Fin: " + fish.getFin());
		System.out.println("Vertebrates?: " + fish.isBackbone());
		System.out.println("The number of bloodtype: " + fish.getBloodtype());
		System.out.println("Habitat: " + fish.getHabitatFish());
		System.out.println("Respiration: " + fish.getRespFish());
		
		System.out.println(fish);
	}

	

}
