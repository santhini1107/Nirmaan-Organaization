package day16;

class Dog implements IAnimal{

	@Override
	public void move() {
		System.out.println("The dog runs on four legs");
		
	}
	@Override
	 public void speak() {
		System.out.println("The dog says:Wooff Woof!");
	}
}
class Bird implements IAnimal{

	@Override
	public void move() {
		System.out.println("The bird  flies in the sky");
		
	}
	public void speak() {
		System.out.println("The bird says:Chirp Chirp!");
	}

}	
public class Testing {
	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.move();
		dog.speak();
		Bird bird=new Bird();
		bird.move();
		bird.speak();
		System.out.println(IAnimal.isMammal("dog"));
		System.out.println(IAnimal.isMammal("bird"));
		System.out.println(IAnimal.name);
	}

}
