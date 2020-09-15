package prgs;

import java.util.Scanner;

public class KaprekarNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int n=sc.nextInt();
		int sq=n*n;
		int sum=0;
		int c=(int)Math.log10(sq)+1;
		for(int  i=1;i<c;i++) {
			int first=sq/(int)Math.pow(10, i);
			int second=sq%(int)Math.pow(10, i);
			if(first==0 || second==0) continue;
			sum=first+second;
			if(sum==n) {
				System.out.println(n+" is kaprekar number");
				break;
			}
		}
		if(sum!=n) System.out.println(n+" is not kaprekar number");
	}		

}
