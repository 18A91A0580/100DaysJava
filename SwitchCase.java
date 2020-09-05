package conditionalStatements;
import java.util.Scanner;
public class SwitchCase {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a value :");
		int a=sc.nextInt();
		System.out.print("enter b value :");
		int b=sc.nextInt();
		sc.nextLine();
		System.out.print("enter operation to be performed :");
		char c=sc.nextLine().charAt(0);
		int result=0;
		switch(c) {
		case '+':
		result=a+b;
		break;
		case '-':
		result=a-b;
		break;
		case '*':
		result=a*b;
		break;
		case '/':
		result=a/b;
		break;
		default:
		System.out.print("Invalid operation");
		
		}
		System.out.print(result);
		
	}
	
}
