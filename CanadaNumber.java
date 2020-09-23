package prgs;

import java.util.Scanner;

public class CanadaNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int n=sc.nextInt();
		if(squares(n)==trivial(n)) System.out.println(n+" is canada number");
		else System.out.println(n+" is not canada number");
	}
	static int squares(int n) {
		int sum=0;
		while(n!=0) {
			int d=n%10;
			sum+=d*d;
			n/=10;
		}
		return sum;
	}
	static int trivial(int n) {
		int sum=0;
		for(int i=1;i*i<=n;i++) {
			if(n%i==0) {
				sum+=i+n/i;
			}
		}
		return sum-1-n;
	}
}
