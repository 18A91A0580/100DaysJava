package prgs;

import java.util.Scanner;

public class AutomorphicNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int n=sc.nextInt();
		int temp=n;
		int sq=n*n;
		boolean isAuto=true;
		while(n>0) {
			if(n%10!=sq%10) {
				isAuto=false;
				break;
			}
			n/=10;
		}
		if(isAuto) System.out.println(temp+ " is Automorphic number");
		else System.out.println(temp+ " is not Automorphic number");
	}

}
