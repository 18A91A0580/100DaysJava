package prgs;

import java.util.Scanner;

public class SmithNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int n=sc.nextInt();
		if(isComposite(n)) {
			int a=sumOfDigits(n);
			int b=sumOfPrimeFactors(n);
			if(a==b) System.out.println(n+ " is Smith number");
			else System.out.println(n+ " is not Smith number");
		}
		else System.out.println(n+" is not Smith number");
	}
	static int sumOfDigits(int n) {
		int sum=0;
		while(n>0) {
			int d=n%10;
			sum+=d;
			n/=10;
		}
		return sum;
	}
	static int sumOfPrimeFactors(int n) {
		int i=2;
		int sum=0;
		while(n>1) {
			if(n%i==0) {
				n/=i;
				sum+=sumOfDigits(i);
			}
			else i++;
		}
		return sum;
	}
	static boolean isComposite(int n) {
		boolean check=false;;
		for(int i=2;i*i<n;i++) {
			if(n%i==0) {
				check=true;
			}
		}
		return check;
	}

}
