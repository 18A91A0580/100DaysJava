package prgs;

import java.util.Scanner;

public class NumberRotation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int n=sc.nextInt();
		int t=(int)Math.log10(n)+1;
		int temp=n;
		while(true) {
			int firstdigit=temp/(int)(Math.pow(10,t-1)); //to get first digit
			temp%=Math.pow(10, t-1);                    //to get last digits
			temp=temp*10+firstdigit;
			if(temp==n) break;
			System.out.println(temp);
		}

	}
}

