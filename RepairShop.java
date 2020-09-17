package abstraction;

abstract class Car
{
	abstract void accelerate();
	void p() {
		System.out.println("p is accelerating");
	}
}
class WagonR extends Car{
	
	void accelerate() {
		System.out.println("WagonR is accelerating");
	}
}
class Audi extends Car{
	void accelerate() {
		System.out.println("Audi is accelerating");
	}
}
public class RepairShop {

	public static void main(String[] args) {
		//we cannot create object for abstract class
		//abstract methods must be overridden
		WagonR w=new WagonR();
		w.accelerate();
		w.p();
		Audi a=new Audi();
		a.accelerate();

	}

}
