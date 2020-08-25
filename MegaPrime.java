package prgs;

import java.util.Scanner;

public class MegaPrime {
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
	static boolean isMegaPrime(int n) {
		int s=0;
		if(isPrime(n)) {
			while(n>0) {
				int r=n%10;
				n/=10;
				if(isPrime(r)) s=1;
				else s=0;
			}
			if(s==1) return true;
			else return false;
		}
		else return false;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int n=sc.nextInt();
		if(isMegaPrime(n)) System.out.println(n+" is megaprime");
		else System.out.println(n+" is not megaprime");
	}

}
