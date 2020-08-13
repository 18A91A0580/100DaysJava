package Pack1;
import java.util.Scanner;
public class AreaOfTriangle {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter base :");
		float b=sc.nextFloat();
		System.out.print("enter height :");
		float h=sc.nextFloat();
		System.out.println("Area of triangle = "+(b*h)/2);

	}
}
