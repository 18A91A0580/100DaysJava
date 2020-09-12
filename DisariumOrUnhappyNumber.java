package prgs;

import java.util.Scanner;

public class DisariumOrUnhappyNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		int c=(int)Math.log10(n)+1;
		while(n>0) {
			int d=n%10;
			sum+=(int)Math.pow(d, c--);
			n/=10;
		}
		if(sum==temp) System.out.println(temp+" is unhappy number");
		else System.out.println(temp+" is not unhappy number");
	}

}
