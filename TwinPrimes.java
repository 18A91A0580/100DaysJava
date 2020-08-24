package prgs;

import java.util.Scanner;

public class TwinPrimes {
	static boolean isPrime(int n) {
		boolean f=true;
		for(int i=2;i*i<n;i++) {
			if(n%i==0) {
				f=false;
				break;
			}
		}
		return f;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers :");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		if(isPrime(n1)==true && isPrime(n2)==true && n2-n1==2) {
			System.out.println("Two numbers are twin primes");
		}
		else 
			System.out.println("Two numbers are not twin primes");
	}

}
