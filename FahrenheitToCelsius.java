package basicPrograms;
import java.util.*;
public class FahrenheitToCelsius {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter fahrenheit value : ");
		float f=sc.nextFloat();
		float c=((f-32)*5)/9;
		System.out.println(c);
	}
}
