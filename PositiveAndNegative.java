package basicPrograms;
import java.util.*;
public class PositiveAndNegative {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of values :");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n +" values :");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(a[i]>=0)
				System.out.println(a[i]+ " is positive");
			else System.out.println(a[i]+ " is negative");
		}
	}

}
