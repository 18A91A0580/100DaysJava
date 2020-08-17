package basicPrograms;
import java.util.*;
public class EvenFibonacci {
//Between the range
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of values :");
		int n=sc.nextInt();
		int a=0,b=1;
		for(int i=1;i<=n;i++) {
			int c=a+b;
			a=b;
			b=c;
			if(a>0&&a<n) {
				if(a%2==0) {
					System.out.print(a+" ");
				}
			}
			
		}
	}

}
