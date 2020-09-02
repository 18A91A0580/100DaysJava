package prgs;

import java.util.Scanner;

public class FullEvenOddMixed {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number :");
		int n=sc.nextInt();
		print(n);
	}
	static void print(int n) {
		int temp=n;
		int f=1;
		while(temp>0) {
			int r=temp%10;
			temp/=10;
			if(n%2==0 && r%2!=0) {
				f=2;
				break;
			}
			else if(n%2!=0 && r%2==0) {
				f=2;
				break;
			}
		}
		if(f==1 && n%2==0) System.out.println(n+" is full even");
		else if(f==1 && n%2!=0) System.out.println(n+" is full odd");
		else System.out.println(n+" is mixed number");
	}
}
