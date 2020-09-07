package loops;
import  java. util.Scanner;
public class ForLoop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of digits :");
		int n=sc.nextInt();
		int r=0;
		for(int i=1;i<=n;i++) {
			r+=i;
		}
		System.out.println(r);
	}

}
