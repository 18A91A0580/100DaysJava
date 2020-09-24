package prgs;

import java.util.Scanner;

public class PalindromesInGivenRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers :");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		for(int i=n1 ;i<=n2;i++) {
			if(isPalindrome(i)!=-1) {
				System.out.print(i+" ");
			}
		}
		
	}
	static int isPalindrome(int n) {
		int sum=0;
		int temp=n;
		while(n>0) {
			int d=n%10;
			sum=sum*10+d;
			n/=10;
		}
		if(sum==temp) return temp;
		else return -1;
	}

}
