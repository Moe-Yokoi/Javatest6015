package animal.individual;

import animal.species.Birds;

public class Eagle {

	public static void main(String[] args) {
		
        Birds birds = new Birds();
		
		System.out.println("Feathers: " + birds.getFeathers());
		System.out.println("Vertebrates?: " + birds.isBackbone());
		System.out.println("The number of bloodtype: " + birds.getBloodtype());
		System.out.println("Habitat: " + birds.getHabitat());
		System.out.println("Respiration: " + birds.getRespiration());
		
		System.out.println(birds);
	}

	

}
