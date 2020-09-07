package loops;
import java.util.*;
public class Power {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter nummber :");
		int n=sc.nextInt();
		int result=1;
		for(int i=1;i<=n;i++) {
			result*=i;
		}
		System.out.println(result);
	}

}
