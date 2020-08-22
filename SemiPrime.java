package prgs;
import java.util.*;
public class SemiPrime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int n=sc.nextInt();
		int temp=n;
		int c=0;
		for(int i=2;i*i<=n && c<2 ;i++)
		{
			while(temp%i==0)
			{
				temp=temp/i;
				c++;
			}
		}
		if(temp>1) c++;
		if(c==2) System.out.println(n+" Semi prime");
		else System.out.println(n+" not a Semi prime");
	}

}
