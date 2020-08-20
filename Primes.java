package basicPrograms;
import java.util.*;
public class Primes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers :");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		String p="";
		for(int i=n1+1;i<n2;i++) {
			int c=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) c++;
			}
			if(c==2) p=p+i+" ";
		}
		System.out.print(p);
	}

}
