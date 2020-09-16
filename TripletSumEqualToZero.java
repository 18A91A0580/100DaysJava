package geeksforgeeks;

import java.util.Arrays;
import java.util.Scanner;



public class TripletSumEqualToZero {
	static boolean tripletsum(int a[],int n) {
		Arrays.sort(a);
		for(int i=0;i<n-2;i++) {
			if(twosum(a,-a[i],i+1)) return true;
		}
		return false;
	}
	static boolean twosum(int a[],int x,int i) {
		int j=a.length-1;
		while(i<j) {
			if(a[i]+a[j]>x) j--;
			else if(a[i]+a[j]<x) i++;
			else return true;
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of test cases: ");
		int t=sc.nextInt();
		
		while(t--!=0) {
			System.out.println("Enter no. of inputs: ");
			int n=sc.nextInt();
			int[] a=new int[n];
			System.out.println("Enter "+n+" inputs: ");
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			if(tripletsum(a,n)) System.out.println("Triplet with sum zero is found");
			else System.out.println("Triplet with sum zero is not found");
		}
	}

}
