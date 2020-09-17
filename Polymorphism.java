package polymorphism;

class Animal{                  //run time polymorphism
	
}
class Pet extends Animal{
	void walk() {
		System.out.println("pet is walking");
	}
}
class Dog extends Pet{
	void walk() {
		System.out.println("dog is walkking");
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		Dog d=new Dog();
		Pet p=d ;
		d.walk();
		p.walk();

	}

}
