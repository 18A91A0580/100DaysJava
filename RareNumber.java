package prgs;

import java.util.Scanner;

public class RareNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int n=sc.nextInt();
		int rev=reverse(n);
		int a=0,b=0;
		if(rev!=-1) {
			a=n+rev;
			b=n-rev;
		}
		if(perfect(a) && perfect(b)) System.out.println(n+" is Rare number");
		else System.out.println(n+" is not Rare number");
	}
	static int reverse(int n) {
		int temp=n;
		int rev=0;
		while(n>0) {
			int d=n%10;
			rev=rev*10+d;
			n/=10;
		}
		if(n!=temp) return rev;
		else return -1;
	}
	static boolean perfect(int n) {
		boolean isPerfect=false;
		double sr=Math.sqrt(n);
		if(sr-Math.floor(sr)==0) isPerfect=true;
		return isPerfect;
	}

}
