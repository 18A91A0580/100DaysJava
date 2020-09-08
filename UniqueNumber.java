package prgs;

import java.util.Scanner;

public class UniqueNumber {

	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int n=sc.nextInt();
		int temp=n;
		boolean isUnique=true;
		for(int i=0;i<=9;i++) {
			n=temp;
			int c=0;
			while(n>0) {
				int d=n%10;
				if(d==i) c++;
				if(c>1) {
					isUnique=false;
					break;
				}
				n/=10;
			}
		}
		if(isUnique) System.out.println(temp+ " is unique number");
		else System.out.println(temp+ " is not unique number");
	}

}
