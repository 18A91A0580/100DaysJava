package prgs;

import java.util.Scanner;

public class AdamNumber {
	

	static int rev(int n) {
		int temp=n;
		int rev=0;
		while(temp>0) {
			int d=temp%10;
			temp/=10;
			rev=rev*10+d;
		}
		return rev;
	}
	static int square(int n) {
		return n*n;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int n=sc.nextInt();
		int a=square(n);
		int b=square(rev(n));
		
		if(a==rev(b)) System.out.println(n+" is Adam number");
		else System.out.println(n+" is not Adam number");
	}

}
