package day16;

public interface IAnimal {
	String name="Living Being";
	static boolean isMammal(String animalName) {
		return(animalName.equalsIgnoreCase("Dog"))||(animalName.equalsIgnoreCase("Cat"))||(animalName.equalsIgnoreCase("Human"));
	}
	default void speak() {
		System.out.println("Animal is making a sound");
	}
	void move();
	
	

}
