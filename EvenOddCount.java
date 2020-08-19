package basicPrograms;
import java.util.*;
public class EvenOddCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size :");
		int n=sc.nextInt();
		int[] a=new int[n];
		int even=0,odd=0;
		System.out.println("Enter "+n+" values :");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(a[i]%2==0) {
				even++;
			}
			else odd++;
		}
		System.out.println("even values are "+even);
		System.out.println("odd values are "+odd);
	}

}
