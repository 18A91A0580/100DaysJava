package basicPrograms;
import java.util.*;
public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter celsius value :");
		float c=sc.nextFloat();
		float f=((c*9)/5)+32;
		System.out.println(f);
	}

}
