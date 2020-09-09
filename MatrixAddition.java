package arrays;
import java.util.*;
public class MatrixAddition {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter no. of rows and columns");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int[][] a=new int[r][c];
		int[][] b=new int[r][c];
		int[][] s=new int[r][c];
		System.out.println("Enter array a :");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]=sc.nextInt();
			}
		
		}
		System.out.println("Enter array b :");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				s[i][j]=a[i][j]+b[i][j];
			}
		}
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(s[i][j]+"\t");
			}
			System.out.println();
		}	
	}

}
