package strings;

public class StringIntro {

	public static void main(String[] args) {
		String name="Deva Rushi";  				//Deva Rushi will be created in string pool area
		String name2=new String("Deva Rushi");//Deva Rushi will be created in heap area
		String name3="      Deva Rushi                    ";
		String cars="Audi,BMW,Ferrari,Lamborghini";
		String[] allCars=cars.split(",");
		System.out.println(name.charAt(3));
		System.out.println(name.length());
		System.out.println(name.substring(3));
		System.out.println(name.substring(3,7));
		System.out.println(name.substring(0,10));
		System.out.println(name.equals(name2));
		System.out.println(name.isEmpty());
		System.out.println(name.concat(" Kamidi"));
		System.out.println(name.replace("a","A"));
		for(String c:allCars) System.out.println(c);
		System.out.println(cars.indexOf("r"));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name3.trim()+" front and back spaces will be cleared");
	}

}
