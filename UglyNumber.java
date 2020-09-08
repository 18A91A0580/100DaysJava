package prgs;

import java.util.Scanner;

public class UglyNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int n=sc.nextInt();
		int temp =n;
		boolean isUgly=true;
		while(n!=1) {
			if(n%2==0) n/=2;
			else if(n%5==0) n/=5;
			else if(n%3==0) n/=3;
			else {
				isUgly=false;
				break;
			}
		}
		if(isUgly) System.out.println(temp+" is an ugly number");
		else System.out.println(temp+" is not an ugly number");
	}

}
