package prgs;

import java.util.Scanner;

public class TriperfectNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i*i<=n;i++) {
			if(n%i==0) {
				if(n/i==i) sum+=i;
				else sum+=i+n/i;
			}
		}
		if(n*3==sum) System.out.println(n+" is Triperfect number");
		else System.out.println(n+" is not Triperfect number");
	}

}
