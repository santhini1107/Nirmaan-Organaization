package day13;

class Animals{
	void makeSound() {
		System.out.println("This animal makes sound");
	}
}
	class Dog extends Animals{
		@Override
		void makeSound() {
			System.out.println(" The dog barks  ");
		}
	}
	class Cat extends Animals{
		@Override
		void makeSound() {
			System.out.println(" The cat meows ");
		}
	}
public class Inheritance {
	public static void main(String[] args) {
		Dog D=new Dog();
		Cat C=new Cat();
		C.makeSound();
		D.makeSound();
		
	}

}
