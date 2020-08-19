package basicPrograms;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size :");
		int n=sc.nextInt();
		int[] a=new int[n];
		int sum,r,temp;
		System.out.println("Enter "+n+" values :");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			sum=0;
			temp=a[i];
			while(temp>0)
			{
				r=temp%10;
				sum=(sum*10)+r;
				temp/=10;
			}
			if(sum==a[i])System.out.println("Palindrome");
			else System.out.println("Not Palindrome");
		}
	}

}
