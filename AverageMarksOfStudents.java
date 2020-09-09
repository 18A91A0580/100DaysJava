package arrays;
import java.util.*;
public class AverageMarksOfStudents {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of students :");
		int n=sc.nextInt();
		int[] a=new int[n];
		int avg,sum=0;
		System.out.println("Enter marks :");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			sum+=a[i];
		}
		avg=sum/n;
		System.out.println("Average marks = "+avg);
		
	}

}
