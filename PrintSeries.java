package prgs;

import java.util.Scanner;

public class PrintSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int n=sc.nextInt();
		int i=1;
		while(n!=0) {
			if(i<n) {
				System.out.print(i+" ");
				i++;
			}
			else {
				System.out.print(n--+" ");
			}
		}
		

	}
}
