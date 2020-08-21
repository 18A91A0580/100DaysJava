package prgs;
import java.util.*;
public class NearestPrime {
	Scanner sc=new Scanner(System.in);
	boolean isPrime(int n)
	{
		int c=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0) c++;
		}
		if(c==0) return true;
		else return false;
	}
	int before(int n)
	{
		int c=0;
		while(true)
		{
			if(isPrime(n)) return c;
			else 
			{
				n--;
				c++;
			}
		}
	}
	int after(int n)
	{
		int c=0;
		while(true)
		{
			if(isPrime(n)) return c;
			else 
			{
				n++;
				c++;
			}
		}
	}
	void nearest()
	{
		System.out.println("Enter number :");
		int n=sc.nextInt();
		int m1=before(n);
		int m2=after(n);
		if(m1>m2)
		{
			System.out.println("Nearest Prime :"+(n+m2));
		}
		else if(m2>m1)
		{
			System.out.println("Nearest Prime :"+(n-m1));
		}
		else
		{
			if(m1!=0 && m2!=0)
			System.out.println("Nearest Primes :"+(n-m1)+" "+(n+m2));
			else System.out.println("Nearest Prime :"+(n));
		}
	}
	
	public static void main(String[] args) {
		NearestPrime obj=new NearestPrime();
		obj.nearest();
	}

}
