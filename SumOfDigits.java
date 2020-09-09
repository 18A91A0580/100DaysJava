package whileLoops;
import java.util.*;
public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int n=sc.nextInt();
//		int t=(int)Math.log10(n)+1; To know no. of digits 
//		System.out.println(t);
		int sum=0,r;
		while(n!=0) {
			r=n%10;
			sum+=r;
			n/=10;
		}
		System.out.println(sum);
	}

}
