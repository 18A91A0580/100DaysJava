package userInput;
import java.util.Scanner;
public class ScannerUserInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float p=sc.nextFloat();
		float t=sc.nextFloat();
		float r=sc.nextFloat();
		float s=(p*t*r)/100;
		System.out.println(s);
	}

}
