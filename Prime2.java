package userInput;
import java.util.*;
public class Prime2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int c= 0;
		if(n==0||n==1)
		{
			System.out.println("It is not a prime ");
		}
		for(int i=1 ; i<=n ;i++)
		{
			if(n%i==0);
			{
				c++;
			}
		}
		if(c==2)
		
			System.out.println("It is  a prime ");
		
		else
		
			System.out.println("It is not a prime");
		
	}
}