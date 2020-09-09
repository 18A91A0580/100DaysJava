package prgs;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int n=sc.nextInt();
		int temp=n;
		int sq=n*n;
		int sum=0;
		while(sq>0) {
			int d=sq%10;
			sq/=10;
			sum+=d;
		}
		if(sum==n) System.out.println(n+" is neon number");
		else System.out.println(n+" is not neon number");

	}

}
