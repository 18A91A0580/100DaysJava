package loops;
import java.util.*;
public class SeriesSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);	
		System.out.println("Enter number :");
		int n=sc.nextInt();
		float result=0;
		for(float i=1;i<=n;i++) {
			result+=1/i;
		}
		System.out.println(result);
	}

}
