package oops;
import java.util.*;
class Vehicle
{
	int wheels;
	int headlights;
	String colour;
	Vehicle(int wheels){
		this.wheels=wheels;
		headlights=2;
	}
    Vehicle(String s) {
		colour=s;
	}
    
}
public class MyConstructor {
	MyConstructor(){
		System.out.println("object is created");
	}

	public static void main(String[] args) {
		
		Vehicle v=new Vehicle(4);
	
		System.out.println(v.wheels+" wheels");
		 System.out.println(v.headlights);
			
		Vehicle v2=new Vehicle("Red");
		System.out.println(v2.colour);
	    Vehicle v1=new Vehicle(4);
	    Vehicle v3=new Vehicle("Blue");
	    System.out.println(v1.wheels+" wheels");
	    System.out.println(v.headlights);
	    System.out.println(v3.colour);
		

	}

}
