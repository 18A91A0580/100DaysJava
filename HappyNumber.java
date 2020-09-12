package prgs;

import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int n=sc.nextInt();
		int result=n;
		while(result!=1 && result!=4) {
			result=print(result);
		}
		if(result==1) System.out.println(n+" is happy number");
		else System.out.println(n+" is not happy number");
	}
	static int print(int n) {
		int temp=0;
		while(n!=0) {
			
			int r=n%10;
			temp+=(int)Math.pow(r,2);
			n/=10;
			
		}
		return temp;
	}

}
