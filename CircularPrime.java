package prgs;
import java.util.*;
public class CircularPrime {
	static boolean isPrime(int n)
	{
		boolean f=true;
		for(int i=2;i*i<n;i++) {
			if(n%i==0) {
				f=false;
				break;
			}
		}
		return f;
	}
	static boolean circular(int n) {
		int temp=n;
		int c=(int)Math.log10(n)+1;
		while(isPrime(n)) {
			int l=n%10;
			int s=n/10;
			n=(int)(Math.pow(10,c-1)*l)+s;
			if(n==temp) return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int n=sc.nextInt();
		if(circular(n)) System.out.println(n+" is circular prime");
		else System.out.println(n+" is not circular prime");
	}

}
