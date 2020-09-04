package prgs;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number :");
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		while(temp>0) {
			int r=temp%10;
			
			temp/=10;
			sum+=factorial(r);
		}
		if(sum==n) System.out.println(n+" is strong nummber");
		else System.out.println(n+" is not strong number");

	}
	static int factorial(int n) {
		if(n==0) return 1;
		return factorial(n-1)*n;
	}

}
