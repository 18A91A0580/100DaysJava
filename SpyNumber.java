package prgs;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number :");
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		int mul=1;
		while(temp>0) {
			int r=temp%10;
			
			temp/=10;
			mul*=r;
			
			sum+=r;
		}
		if(sum==mul) System.out.println(n+" is spy nummber");
		else System.out.println(n+" is not spy number");


	}

}
