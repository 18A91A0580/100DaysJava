package loops;
import java.util.*;
public class SeriesSum1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of values :");
		int n=sc.nextInt();
		float sum=0;
		for(float i=1;i<=n;i++) {
			if(i%2==0)
				sum-=1/i;
			else sum+=1/i;
		}
		System.out.println(sum);
	}

}
