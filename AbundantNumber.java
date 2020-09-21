package prgs;



import java.util.Scanner;

public class AbundantNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i*i<n;i++) {
			
			if(n%i==0) sum+=i+n/i;
		}
		if(sum>n) System.out.println(n+" is Abudant number");
		else System.out.println(n+" is not Abudant number");
	}

}

