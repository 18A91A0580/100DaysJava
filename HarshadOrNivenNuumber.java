package prgs;

import java.util.Scanner;

public class HarshadOrNivenNuumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		while(temp>0) {
			int d=temp%10;
			temp/=10;
			sum+=d;
		}
		if(n%sum==0) System.out.println(n+" is harshad number");
		else System.out.println(n+" is not harshad number");
	}

}
