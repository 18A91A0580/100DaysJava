package loops;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int n=sc.nextInt();
		int result=1;
		for(int i=1;i<=n;i++) {
			result*=i;
		}
		System.out.println(result);
		
		
	}

}
