package d;
import java.util.*;
class Armstrong {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n,sum=0;
		int t=(int)Math.log10(n)+1;
		while(temp>0) {
			int r=temp%10;
			sum=sum+(int)(Math.pow(r,t));
			temp/=10;
		}
		if(sum==n) System.out.println("Armstrong");
		else System.out.println("Not Armstrong");
	}

}
