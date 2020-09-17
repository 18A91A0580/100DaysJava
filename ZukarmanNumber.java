package prgs;

import java.util.Scanner;

public class ZukarmanNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int n=sc.nextInt();
		int temp=n;
		int pro=1;
		while(n>0) {
			int d=n%10;
			pro*=d;
			n/=10;
		}
		if(temp%pro==0) System.out.println(temp+" is zukarman number");
		else System.out.println(temp+" is not zukarman number");
	}

}
