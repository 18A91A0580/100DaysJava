package whileLoops;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int n=sc.nextInt();
		int p=0;
		int temp=n;
		while(temp>0) {
			int l=temp%10;
			p=p*10+l;
			temp/=10;
		}
		if(p==n) System.out.println(n+" is a palindrome");
		else System.out.println(n+" is not a palindrome");
	}

}
