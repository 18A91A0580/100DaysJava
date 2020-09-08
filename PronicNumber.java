package prgs;

import java.util.Scanner;

public class PronicNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int n=sc.nextInt();
		boolean isPronic=false;
		for(int i=1;i<n;i++) {
			if(i*(i+1)==n) {
				isPronic=true;
				break;
			}
		}
		if(isPronic) System.out.println(n+" is pronic number");
		else System.out.println(n+ " is not pronic number");
	}

}
